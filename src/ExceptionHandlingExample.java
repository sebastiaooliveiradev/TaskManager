public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3 };
            System.out.println(numbers[5]);
        } catch (Exception e) {
            System.out.println("Erro: Acesso a indice fora dos limites do Array");
        } finally {
            System.out.println("Bloco Finally executado.");
        }
    }
}
