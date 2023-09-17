package class24;

import java.util.ArrayList;

/*
Create an arrayList of drinks call it. If any drink has letter “a”
or “e” replace the whole word with water.
 */
public class T2 {

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("cola");
        drinks.add("sprite");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {

            String drink=drinks.get(i);
            if(drink.contains("a")||drink.contains("e")){
                drinks.set(i,"Water");
            }
        }

        System.out.println(drinks);
    }
}
