import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "C:\\Development\\tools\\WorkspaceGuiado\\Executavel\\src\\arquivo-gerado.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Olá, Mundo!");
            bw.newLine();
            bw.write("Este é um exemplo de escrita em arquivo.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
