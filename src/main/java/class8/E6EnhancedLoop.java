package class8;

public class E6EnhancedLoop {
    public static void main(String[] args) {
        // print all the even numbers one by one from this array using enhanced for loop
        int[] nums = {10, 23, 25, 56, 45, 20};
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]>20){
                nums[i]=0;
            }
            System.out.println(nums[i]);
        }



    }
}
