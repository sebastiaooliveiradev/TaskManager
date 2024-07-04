import java.util.ArrayList;
import java.util.HashMap;

public class ArraysExample {

    public static void main(String[] args) {
//        Arrays são estruturas que armazenam um número fixo de elementos do mesmo tipo.
//        int[] numbers = {1,2,3,4,5,6,7,8,9};
//        System.out.println("Primeiro elemento:"+numbers[0]);
//        System.out.println("Segundo elemento:"+numbers[1]);

//        percorrendo array usando laço for
//        for(int i=0; i<=numbers.length; i++){
//            System.out.println("elemento na posição "+i+": "+numbers[i]);
//        }

//        percorrendo o array com o laç for-each
//        System.out.println("-------------- percorrendo o array com o laç for-each");
//        for(int number:numbers){
//            System.out.println(number);
//        }

//        Criando um array de strings
//        String[] fruits = new String[3];
//        fruits[0] = "Maça";
//        fruits[1] = "Banana";
//        fruits[2] = "Laranja";
//
//        for (String fruit:fruits){
//            System.out.println("Fruta: "+fruit);
//        }

//        A classe ArrayList é uma coleção dinâmica que pode crescer conforme necessário.
//        criando um ArrayList de Srings
//        ArrayList<String> names = new ArrayList<>();
//        names.add("John");
//        names.add("Jane");
//        names.add("Bob");
//        names.add("Mary");
//
//        //acessando os elementos do ArrayList
//        System.out.println("Primeiro elemento:"+names.get(0));
//
////        Percorrendo o ArrayList
//        for(String name:names){
//            System.out.println("Nome: "+name);
//        }

//        A classe HashMap armazena pares de chave-valor, permitindo acesso rápido aos valores através das chaves.
//        criando um HashMap para armazenar a idade das pessoas
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("John", 20);
        ages.put("Jane", 25);
        ages.put("Jack", 26);
        ages.put("Jill", 27);
        System.out.println("idade da John: " + ages.get("John"));

//        percorrendo o HashMap
        for(String name: ages.keySet()){
            System.out.println("Nome: "+name+" idade: "+ages.get(name));
        }




    }
}
