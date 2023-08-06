package class6;

public class T11ForLoop {
    public static void main(String[] args) {
 // Print only odd numbers from 100 to 1
        //(2 different way)
        for (int i = 99; i>=1 ; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        int y=99;

        while (y>=1){
            System.out.print(y+" ");
            y-=2;
        }

    }
}
