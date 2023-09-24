package class26;

import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeup=new TreeMap<>();
        makeup.put("Lipsticks",22.0);
        makeup.put("BlushOn",40.0);
        makeup.put("Base",50.5);
        makeup.put("Foundation",90.5);
        makeup.put("EyeLiner",25.5);
        makeup.put("Concealer",35.5);
        makeup.put("EyeLiner",25.5);
        System.out.println(makeup);
        Collection<String> onlyKeys=makeup.keySet();
        Collection<Double> onlyValue=makeup.values();
        System.out.println(onlyKeys);
        System.out.println(onlyValue);
        //Break till 11:55



    }
}
