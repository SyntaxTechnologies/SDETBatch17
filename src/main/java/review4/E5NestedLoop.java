package review4;

public class E5NestedLoop {
    public static void main(String[] args) {
        /*
         *
         * *
         * * *
         * * * *
         * * *
         * *
         *

         */
// Break till 8:53
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 1; j <= 3; j++) {
            for (int i = 0; i < 4 - j; i++) { //3
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
