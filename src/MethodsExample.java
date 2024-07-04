public class MethodsExample {
    public static void main(String[] args) {

        int sum = add(3, 5);
        System.out.println("A soma: " + sum);

        int result = multiply(5,3);
        System.out.println("A result: " + result);

        System.out.println("O calculo do método é: "+teste());

    }

        public static int add(int a, int b){
            return a+b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int teste() {
            int calculo = 10;
            return calculo;
        }
}
