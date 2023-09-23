package class25;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);
        numbers.add(50);
        numbers.add(12);
        numbers.forEach(x-> System.out.println(x));



    }
}
