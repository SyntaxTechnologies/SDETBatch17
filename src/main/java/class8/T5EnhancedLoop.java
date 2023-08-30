package class8;

public class T5EnhancedLoop {
    public static void main(String[] args) {
        // find the largest even number
        int[] nums = {10, 77, 25, 56, 60, 20};
        int largest=nums[0];
        for(int tahmin:nums){
            if(tahmin>largest&& tahmin%2==0){
                largest=tahmin;
            }
        }
        System.out.println(largest);

    }
}
