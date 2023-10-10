package review12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {
       Map<String,Double> studentMarksMap=new HashMap<>();
       studentMarksMap.put("Habib",95.5);
       studentMarksMap.put("Madina",95.5);
       studentMarksMap.put("Arthur",89.5);
       studentMarksMap.put("Nelson",95.5);
        System.out.println(studentMarksMap);



        LinkedHashMap<String,Double> studentMarksMap1=new LinkedHashMap<>();
        studentMarksMap1.put("Habib",95.5);
        studentMarksMap1.put("Madina",95.5);
        studentMarksMap1.put("Arthur",89.5);
        studentMarksMap1.put("Nelson",95.5);
        System.out.println(studentMarksMap1);

        TreeMap<String,Double> studentMarksMap2=new TreeMap<>();
        studentMarksMap2.put("Habib",95.5);
        studentMarksMap2.put("Madina",95.5);
        studentMarksMap2.put("Arthur",89.5);
        studentMarksMap2.put("Nelson",95.5);
        System.out.println(studentMarksMap2);
        //Break till 8:54
    }
}
