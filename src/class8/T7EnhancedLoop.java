package class8;

public class T7EnhancedLoop {
    public static void main(String[] args) {
        // go through the array and replace all the negative numbers with 0
        //Break till 1:54
        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]<0){
                nums[i]=0;
            }
        }
        for (int num : nums) {
            System.out.println(num);
        }


    }
}
