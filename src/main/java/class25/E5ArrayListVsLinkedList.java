package class25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class E5ArrayListVsLinkedList {
    public static void main(String[] args) {

        long startingTime=System.currentTimeMillis();
        // 45  1340
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println(numbers.get(100000));
        }

        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);



    }
}
