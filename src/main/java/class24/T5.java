package class24;

import java.util.ArrayList;

public class T5 {
    public static void main(String[] args) {
        /*
        create an arrayList of fruit then remove all the fruit which contains
        the letter a or ends with the letter e
         */
        ArrayList <String> fruit= new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Watermelon");
        fruit.add("Peach");
        fruit.removeIf(d->d.contains("a")||d.endsWith("e"));
        System.out.println(fruit);

    }
}
