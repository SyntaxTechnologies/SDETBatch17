package class25;

import java.util.TreeSet;
/*

Create a Set in which you need to add names of the countries(10).
In this set we want all objects to be sorted in alphabetical order. Using 2 different
ways retrieve all elements from set.

 */
public class T3Sets {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("England");
        countries.add("Brazil");
        countries.add("Argentina");
        countries.add("Canada");
        countries.add("USA");
        countries.add("Peru");
        countries.add("Pakistan");
        countries.add("Germany");
        countries.add("Poland");
        countries.add("Turkey");
        System.out.println(countries);
        System.out.println();
        for(String c:countries){
            System.out.println(c);
        }
        countries.forEach(x-> System.out.println(x));
    }

}
