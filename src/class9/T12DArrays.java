package class9;

public class T12DArrays {
    public static void main(String[] args) {
        // print only even numbers from this array
        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {  //numbers[row] => gives us the complete 1D array
                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }
    } // Break till 11:48
}
