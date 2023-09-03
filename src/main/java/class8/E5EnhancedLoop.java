package class8;

public class E5EnhancedLoop {
    public static void main(String[] args) {
        // print all the even numbers one by one from this array using enhanced for loop
        int[] nums = {10, 23, 25, 56, 45, 20};
        for (int number:nums){

            if(number%2==0){
                System.out.println(number);
            }
        }

    }
}
