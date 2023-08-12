package class7;

public class T8Arrays {
    /*
   Add all the numbers from the array and print the sum at the end.
     */
    public static void main(String[] args) {
        int [] numbers={20,10,50,30,40}; //150

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
            System.out.println(numbers[i]);}
        }
    }
}
