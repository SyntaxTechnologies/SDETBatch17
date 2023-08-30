package class8;

public class T4EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};
        int largest = nums[0];
        for (int tylorSwift : nums) {

            if (tylorSwift > largest) {
                largest = tylorSwift;
            }
        }
        System.out.println(largest);

    }
}
