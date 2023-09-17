package class24;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();
        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");
       /* for (String x:words){
            System.out.println(x);
        }*/
        words.forEach(x-> System.out.println(x));
      /*  for (int i = 0; i<words.size(); i++) {

            if(words.get(i).contains("e")){
                words.remove(i);
            }
        }
*/
        words.removeIf(x->x.contains("e"));


    }
}
