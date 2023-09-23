package class25;

import java.util.HashSet;

public class E7Sets {
    //Sets
    public static void main(String[] args) {

        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);
        //1)No Duplicates 2) No Insertion Order
        fruit.forEach(x-> System.out.println(x));
        System.out.println("**************");
        for (String f:fruit){
            System.out.println(f);
        }


    }
}
