package class25;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class T2ArrayList {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);
        LinkedHashSet<String> set = new LinkedHashSet<>(aList);
        aList.clear();
        aList.addAll(set);
        System.out.println(aList);


    }
}
