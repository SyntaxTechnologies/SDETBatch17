package class9;

public class E82DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int[] row : numbers) {

            for (int col : row) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
