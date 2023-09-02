package class15;

import java.util.Scanner;

public class DogTester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jacky", "German", "Pink", 25);
        d1.printInfo();
        Dog d2 = new Dog("Tom", "Russian", "Black", 23);
        d2.printInfo();

        String name="Alina";
        int size=name.length();
        //Break till 12:00

        Scanner scanner=new Scanner(System.in);
        Dog d3=new Dog("Jacky", "German", "Pink");
    }
}
