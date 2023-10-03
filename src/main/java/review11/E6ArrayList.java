package review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple"); //0
        fruit.add("Mango"); // 1
        fruit.add("Orange"); //2
        fruit.add("Kiwi"); //3
        fruit.add("Banana"); //4
        fruit.add("Cherry"); //5
        fruit.add("Apple"); //6

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Carrot");
        vegetables.add("Cucumber");
        System.out.println(vegetables);
        vegetables.addAll(fruit);
        System.out.println(vegetables);
        vegetables.removeAll(fruit);
        System.out.println(vegetables);




    }
}
