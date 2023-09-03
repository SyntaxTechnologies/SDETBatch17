package class3;
/*
 Create Java program to store 2 values for expected and actual hours. Your program should check
if actual hours are more than  expected hours the program should print “You will love the course and
you will succeed”,
otherwise “Course will be very hard for you!”

 */
public class T3 {
    public static void main(String[] args) {
        double expectedHour=20;
        double actualHour=25;
        if(actualHour>expectedHour){
            System.out.println("You will love the course and you will succeed");
        }else {
            System.out.println("Course will be very hard for you!");
        }

    }
}
