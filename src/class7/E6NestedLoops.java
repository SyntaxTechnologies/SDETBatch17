package class7;

public class E6NestedLoops {
    /*
      #
    * ##
    * ####
    * #####
    * ######
     */
    public static void main(String[] args) {
        // 0 1 2 3 4 5

        for (int j = 0; j <=5 ; j++) {
            for (int i = 0; i <=j ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
