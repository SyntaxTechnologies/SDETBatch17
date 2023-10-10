package review12;

import java.util.*;

public class E2Sets {
    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<>();
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        LinkedHashSet<Integer> numSet=new LinkedHashSet<>(nums);
       /* System.out.println(numSet);
        nums=new ArrayList<>(numSet);
        System.out.println(nums);*/
        nums.clear();
        nums.addAll(numSet);
        System.out.println(nums);



    }
}
