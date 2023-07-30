package class4;

/*
Write a program to store a value whether user has degree or not.
If user has a degree, you should say congratulations and after that
check  If gpa score is higher or equals to 3.5 → output should say
“You are eligible for scholarship”, otherwise → “You should have studied harder” .
if user does not have a degree print you should get a degree
 */
public class T1 {
    public static void main(String[] args) {
        boolean degree = true;
        double gpa = 3.6;
        if (degree == true) {
            System.out.println("congratulations");
            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {

                System.out.println("You should have studied harder");
            }

        } else {
            System.out.println("you should get a degree");
        }
    }
}
