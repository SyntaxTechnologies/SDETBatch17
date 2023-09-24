package class26;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class E8Maps {
    public static void main(String[] args) {


        LinkedList<ArrayList<Integer>> test=new LinkedList<>();

        ArrayList<String> names=new ArrayList<>();
        names.add("Jamel");
       // test.add(20) // error
       // test.add(names)
        LinkedList<Integer> numbers=new LinkedList<>();
       // test.add(numbers)
        Map<String,Integer> map=new HashMap<>();
       // test.add(map)
        ArrayList<Integer> n=new ArrayList<>();
        test.add(n);

    }
}
