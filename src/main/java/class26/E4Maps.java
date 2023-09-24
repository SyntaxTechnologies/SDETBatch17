package class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOn",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("EyeLiner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("EyeLiner",25.5);
        // Both keys and values
      //  makeup.forEach((k,v)-> System.out.println(k+" "+v));
        // Prints only keys
       // makeup.forEach((k,v)-> System.out.println(k));
        //only values
       // makeup.forEach((k,v)-> System.out.println(v));
        // whenever you need more than one parameter you need to put parentheses
        //similarly if we want to have more than one line of code we need to have
        //curly brackets as well
        makeup.forEach((k,v)-> System.out.println(k+" "+v)
        );
    }
}
