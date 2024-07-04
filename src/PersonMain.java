public class PersonMain {

    public static void main(String[] args) {

//        criando objetos da classe Person
        Person person1 = new Person("Ana", 25);
        Person person2 = new Person("Bob", 34);

//        chamando os métoodos dos objetos
        person1.displayInfo();
        person2.displayInfo();

    }
}
