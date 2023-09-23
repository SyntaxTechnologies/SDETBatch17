package class25;

import java.util.ArrayList;
import java.util.LinkedList;

public class E4ArrayListVsLinkedList {
    public static void main(String[] args) {

        long startingTime=System.currentTimeMillis();

        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            numbers.add(0,i);
        }

        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);



    }
}
