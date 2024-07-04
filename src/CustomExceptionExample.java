public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkNumber(10);
//            checkNumber(-1);
        } catch (CustomException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws CustomException {
        if (number <0) {
            throw new CustomException("O número não pode ser negativo.");
        } else {
            System.out.println("Número válido: " + number);
        }
            
    }
}
