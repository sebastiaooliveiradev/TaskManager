import java.io.Serializable;

public class Task implements Serializable {
    private String name;
    private String script;
    private String status;

    public Task(String name, String script) {
        this.name = name;
        this.script = script;
        this.status = "Não iniciado";
    }

    public String getName() {
        return name;
    }

    public String getScript() {
        return script;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " - " + status;
    }
}
