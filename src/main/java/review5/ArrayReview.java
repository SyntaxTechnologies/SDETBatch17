package review5;

public class ArrayReview {

    public static void main(String[] args) {

        int a = 10;

        int[] array={10, 11, 12, 13, 55, 34, 24};

        int numberOfElements=array.length;
        System.out.println(numberOfElements);

        System.out.println(array[3]); // getting 1 element from an array

        /*
            when to use loops - when we want to repeat a block of code

             when we do not know the exact number of iterations - while or do while

             when we know how many times we want to repeat or iterate the code - for loop or enhanced for loop

             we use enhanced for loop ONLY with arrays or collections
         */

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+"  ");
        }

        /*    enhanced for/ for each loop/ advanced for --- loop syntax

                for(DataTypeofElement anyVariableName:NameofTheDataStructure){
                    }
         */

        // int[] array={10, 11, 12, 13, 55, 34, 24};
        for(int ar:array) {
            System.out.println(ar);
        }

    }
}
