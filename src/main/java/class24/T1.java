package class24;

import java.util.ArrayList;

/*
Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that

 */
public class T1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Deepali");
        names.add("Ahmed");
        names.add("Mike");
        names.add("John");
        names.add("Ali");
        System.out.println(names.isEmpty());
        System.out.println(names.contains("John"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
