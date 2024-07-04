import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskManager extends JFrame {
    private DefaultListModel<Task> taskListModel;
    private JList<Task> taskList;
    private JButton addButton, executeButton;
    private JTextField taskNameField, scriptField;

    public TaskManager() {
        setTitle("Task Manager");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("Nome da Operação:"));
        taskNameField = new JTextField();
        inputPanel.add(taskNameField);
        inputPanel.add(new JLabel("Script:"));
        scriptField = new JTextField();
        inputPanel.add(scriptField);
        addButton = new JButton("Adicionar Tarefa");
        inputPanel.add(addButton);
        executeButton = new JButton("Executar Tarefas Selecionadas");
        inputPanel.add(executeButton);

        add(inputPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskName = taskNameField.getText();
                String script = scriptField.getText();
                if (!taskName.isEmpty() && !script.isEmpty()) {
                    taskListModel.addElement(new Task(taskName, script));
                    taskNameField.setText("");
                    scriptField.setText("");
                }
            }
        });

        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeSelectedTasks();
            }
        });

        loadTasks();

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                saveTasks();
                super.windowClosing(e);
            }
        });
    }

    private void executeSelectedTasks() {
        for (int i = 0; i < taskListModel.size(); i++) {
            Task task = taskListModel.get(i);
            if (taskList.isSelectedIndex(i)) {
                try {
                    Process process = Runtime.getRuntime().exec(task.getScript());
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    process.waitFor();
                    task.setStatus("Concluído");
                } catch (Exception ex) {
                    task.setStatus("Erro: " + ex.getMessage());
                }
                taskList.repaint();
            }
        }
    }

    private void saveTasks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tasks.dat"))) {
            oos.writeObject(new ArrayList<>(Collections.list(taskListModel.elements())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadTasks() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tasks.dat"))) {
            List<Task> tasks = (List<Task>) ois.readObject();
            taskListModel.clear();
            for (Task task : tasks) {
                taskListModel.addElement(task);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TaskManager().setVisible(true);
        });
    }
}
