package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        int [] numbers=new int[10];
        System.out.println(numbers);

        ArrayList<Integer> nums=new ArrayList<>(10000);

        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);
        System.out.println(nums);

        nums.remove(new Integer(45));
        System.out.println(nums);

        ArrayList<String> names=new ArrayList<>();
        names.add("Jamil");
        names.add("Artur");
        names.remove("Artur");
        System.out.println(names);


    }
}
