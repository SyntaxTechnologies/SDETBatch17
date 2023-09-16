package class23;

import java.util.ArrayList;
import java.util.Arrays;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr=new ArrayList();
        arr.add("Ace");
        arr.add("Habib");
        arr.add("Gulcan");
        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("sdsd"));
        System.out.println(arr.indexOf("Habib"));

    }
}
