package class8;

public class E7BreakKeyword {
    public static void main(String[] args) {
        // you have to search the array for number 45 it is present in the array
        //print found else do nothing
        int[] nums = {10, 23, 25, 56, 45, 20};

        for (int n : nums) {
            if (n == 10) {
                System.out.println("Found");
                break;
            }
        }


    }
}
