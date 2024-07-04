public class PessoaMain {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("joão", 21);
        p1.displayInfo();

        System.out.println("----------------------------");

        Empregado emp1 = new Empregado("Batista", 85, "Desenvolvedor");
        emp1.displayInfo();




    }
}
