package class26;

import java.util.TreeMap;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.

 */
public class T2Maps {
    public static void main(String[] args) {
        TreeMap<String,String> countries= new TreeMap<>();
        countries.put("Canada","Ottawa");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");
        countries.put("Egypt","Cairo");

        countries.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
