public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[4]);
            int result = 5;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índices fora dos limites do array.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero");
        } catch (Exception e){
            System.out.println("Erro: Ocorreu um erro.");
        }
        finally {
            System.out.println("Bloco Finally executado");
        }

    }
}
