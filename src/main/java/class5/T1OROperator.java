package class5;

import java.util.Scanner;

/*
Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in Mar, Apr, May → season =”Spring”
if user is born in Jun, Jul, Aug →
season =”Summer”  etc …
At the end of the program we should see 1 output as “You were born is season ______”.

 */
public class T1OROperator {  // M upperCase m Lowercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String birthMonth = scanner.next();
        if (birthMonth.equalsIgnoreCase("Mar") ||
                birthMonth.equalsIgnoreCase("Apr") ||
                birthMonth.equalsIgnoreCase("May")
        ) {
            System.out.println("Spring");
        } else if (birthMonth.equalsIgnoreCase("Jun") ||
                birthMonth.equalsIgnoreCase("Jul") ||
                birthMonth.equalsIgnoreCase("Aug")) {
            System.out.println("Summer");
        }


    }
}
