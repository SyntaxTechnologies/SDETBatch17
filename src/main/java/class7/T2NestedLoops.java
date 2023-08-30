package class7;

public class T2NestedLoops {
    /*
    1 2 4 5 6
    1 2 4 5 6
    1 2 4 5 6
    1 2 4 5 6
     */
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 7; j++) {
                if (j != 3) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
