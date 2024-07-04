public class Pessoa {
//    atributos privados
    private String nome;
    private int age;

    //construtor
    public Pessoa(String nome, int age){
        this.nome = nome;
        this.age = age;
    }

//    criar os getters e setters
    public String getNome(){
        return nome;
    }
    public int getAge(){
        return age;

    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public void setAge(int age){
        this.age = age;
    }

//    método para exibir informações
    public void displayInfo(){
        System.out.println("Nome: " + nome + "\nIdade: " + age);
    }




}

