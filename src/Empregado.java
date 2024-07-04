public class Empregado extends Pessoa{

    private String position;

    //construtor
    public Empregado(String nome, int age, String position){
        super(nome, age);
        this.position = position;
    }

    //getter e setter
    public String getPosition(){
        return position;

    }
    public void setPosition(String position){
        this.position = position;

    }

    //sobrescrita do método displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Posição: "+getPosition());
    }
}
