package review12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
       Map<String,Double> studentMarksMap=new HashMap<>();
       studentMarksMap.put("Habib",95.5);
        studentMarksMap.put("Madina",95.5);
        studentMarksMap.put("Arthur",89.5);
        studentMarksMap.put("Nelson",97.5);
        System.out.println(studentMarksMap);
     //  studentMarksMap.forEach((k,v)-> System.out.println(k+" "+v));
        final int[] counter=new int[1];
       studentMarksMap.forEach((k,v)->{

           if(k.contains("a")|| v>96){
               System.out.println(k+" "+v);
               counter[0]++;
           }

       });
        System.out.println(counter[0]);




    }
}
