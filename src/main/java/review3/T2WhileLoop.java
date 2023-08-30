package review3;

public class T2WhileLoop {
    public static void main(String[] args) {
        // 62 63 66 67 68 69 70
        int start = 62;
        int end = 70;

        while (start <= end) {
            if (start != 64 && start != 65) {
                System.out.print(start + " ");

            }
            start++;

        }
    }
}
