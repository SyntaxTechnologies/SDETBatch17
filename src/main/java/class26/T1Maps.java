package class26;

import java.util.LinkedHashMap;
/*
Create a map of a building. Store floor number and its associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map

 */
public class T1Maps {
    public static void main(String[] args) {

            LinkedHashMap<Integer,String> building= new LinkedHashMap<>();
            building.put(1,"Google");
            building.put(2,"Syntax");
            building.put(3,"Google");
            building.put(3,"Amazon");
            building.put(4,"Carbon60");
            building.put(5,"SAP");
            building.put(7,"Syntax");

            System.out.println(building);
            System.out.println("Company Size: "+building.size());
            System.out.println("Company replaced: "+building.replace(4,"Apple"));
            System.out.println("Company removed: "+building.remove(7));

            System.out.println("Updated Building "+building);
    }
}
