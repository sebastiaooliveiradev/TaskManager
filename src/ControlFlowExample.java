import org.w3c.dom.ls.LSOutput;

public class ControlFlowExample {
    public static void main(String[] args) {

        //Exemplo de IF
        System.out.println("------ EXEMPLO DE IF -----");
        int number = 10;

        if (number > 0 ) {
            System.out.println("O número é positivo");
        } else if (number < 0) {
            System.out.println("o número é negativo");
        } else {
            System.out.println("O número é zero");
        }


        //EXEMPLO DE SWITCH
        System.out.println("--- EXEMPO DE SWITCH ---");

        int dayOfWeek = 3;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia Inválido");
                break;

        }

        //Exemplo de for
        System.out.println("--- EXEMPO DO LAÇO FOR---");
        for(int i=0; i<10; i++) {
            System.out.println("Valor de i: "+ i);

        }

        //exemplo de while
        System.out.println("--- EXEMPO DO LAÇO WHILE---");
        int k = 5;
        while(k > 0) {
            System.out.println("Valor de k:"+k);
            k-= 1;
        }

        //EXEMPLO DE DO WHILE
        System.out.println("--- EXEMPO DO LAÇO DO-WHILE---");
        int j = 1;
        do {
            System.out.println("Valor de j: " + j);
            j++;
        } while (j <=5);

    }
}
