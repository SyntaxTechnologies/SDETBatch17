package class26;


import java.util.*;

public class E10Maps {
    public static void main(String[] args) {
        TreeMap<String, Double> makeup = new TreeMap<>();
        makeup.put("Lipsticks", 22.0);
        makeup.put("BlushOn", 40.0);
        makeup.put("Base", 50.5);
        makeup.put("Foundation", 90.5);
        makeup.put("EyeLiner", 25.5);
        makeup.put("Concealer", 35.5);
        makeup.put("EyeLiner", 25.5);

       /* Set<Map.Entry<String, Double>> entries = makeup.entrySet();
        for(Map.Entry<String, Double> e:entries){

            System.out.println(e.getKey()+" "+e.getValue());
        }*/

         var entries=makeup.entrySet();
         for(var e:entries){
             System.out.println(e.getKey()+" "+e.getValue());
         }

         String name="Fahim";
         var name2="Marta";

    }
}
