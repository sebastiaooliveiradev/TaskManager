public class DataTypesExample {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000000L;
        float f = 234.5f;
        double d = 123.4596;
        char c = 'A';
        boolean bool = true;

        //imprimindo valores
        System.out.println("Byte: "+ b);
        System.out.println("Short: "+ s);
        System.out.println("Integer: "+ i);
        System.out.println("Long: "+ l);
        System.out.println("Float: "+ f);
        System.out.println("Double: "+ d);
        System.out.println("Character: "+ c);
        System.out.println("Boolean: "+ bool);

        //operadores aritméticos
        int sum = i +100;
        int difference = i - 50;
        int product = i * 2;
        int quotient = i /4;
        int remainder = i % 3;

        System.out.println("Sum: "+ sum);
        System.out.println("Difference: "+ difference);
        System.out.println("Product: "+product);
        System.out.println("Quotient: "+ quotient);
        System.out.println("Reminder:"+ remainder);

        //operadores relacionais e lógicos
        boolean isEqual = (i == 100000);
        boolean isNotEqual = (i != 100000);
        boolean isGreatherThan = (i > 100000);
        boolean isLessThan = (i < 100000);
        boolean isGreaterThanOrEqual = (i >= 100000);
        boolean osLessThanOrEqual = (i <= 100000);

        System.out.println("Is equal: "+ isEqual);
        System.out.println("Is notEqual: "+ isNotEqual);
        System.out.println("Is greatherThan: "+ isGreatherThan);
        System.out.println("Is lessThan: "+ isLessThan);
        System.out.println("Is greaterOrEqual: "+ isGreaterThanOrEqual);
        System.out.println("Os lessThanOrEqual: "+ osLessThanOrEqual);

        boolean andOperation = (i >10000 && i < 100000);
        boolean orOperation = (i > 10000 || i < 10000);
        boolean notOperation = !(i == 100000);
        System.out.println("And operation: "+ andOperation);
        System.out.println("Or operation: "+ orOperation);
        System.out.println("Not operation: "+ notOperation);





    }
}
