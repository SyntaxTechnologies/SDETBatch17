package class7;

public class T7Arrays {
    /*
    create an array store 5 numbers in it and print all the numbers from the array
     */
    public static void main(String[] args) {
        int [] numbers={20,24,48,69,60}; //20,48,60

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2!=0){
            System.out.println(numbers[i]);}
        }
    }
}
