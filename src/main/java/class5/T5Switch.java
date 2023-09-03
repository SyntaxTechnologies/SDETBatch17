package class5;

import java.util.Scanner;

/*
Ask user to enter their country and capture it.
Once values are captured print which language user speaks.
 */
public class T5Switch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the name of the Country");
        String country=scanner.nextLine();
        country=country.toLowerCase();
        switch (country){
            case "brazil":
                System.out.println("portuguese");
                break;
            case "mexico":
                System.out.println("Spanish");
                break;
            case "india":
                System.out.println("Hindi");
                break;
            case "bolivia":
                System.out.println("spanish");
                break;
            case "afghanistan":
                System.out.println("Farsi");
                break;
            default:
                System.out.println("Country not supported");

        }
    }
}
