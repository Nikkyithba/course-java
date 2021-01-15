package collections;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args ){
        Set<String>fruits = new HashSet<>();
        fruits.add("Bananas");
        fruits.add("oranges");
        fruits.add("lemons");
        fruits.add("apples");
        fruits.add("oranges");


//        System.out.print(fruits);
//        System.out.println();
//        System.out.print(fruits.remove("lemons"));
//        System.out.println();
//        System.out.print(fruits);

        for ( String myFruit: fruits){
            System.out.println(myFruit);
        }


    }

}
