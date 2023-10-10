package review12;


import class17.X;

import static java.util.Map.Entry;
import java.util.*;

public class E5Maps {
    public static void main(String[] args) {
       Map<String,Double> studentMarksMap=new HashMap<>();
       studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Madina",95.5);
        studentMarksMap.put("Arthur",89.5);
        studentMarksMap.put("Nelson",97.5);
        System.out.println(studentMarksMap);

      //  Set<Map.Entry<String, Double>> entrySet = studentMarksMap.entrySet();
        var entrySet = studentMarksMap.entrySet();
        entrySet.removeIf(x->x.getKey().contains("e")||x.getValue()<90);
        System.out.println(studentMarksMap);



    }
}
