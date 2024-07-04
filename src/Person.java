public class Person {
    String name;
    int age;

    //Construtor da classe
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    método para exibir informações
    public void displayInfo(){
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
