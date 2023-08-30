package class3;
/*
Create a Java program and name it Temperature Check.
Create variable to store temperature. Your program should check if
temperature is below 32 then it should print “Water will freeze with
temperature __”, otherwise “Water will NOT freeze with temperature __”.
 */
public class T2TemperatureCheck {
    public static void main(String[] args) {
        double temperature=25;

        if(temperature<32) { //25<32=true
            System.out.println("Water will freeze with temperature "+temperature);
        } else {
            System.out.println("Water will NOT freeze with temperature "+temperature);
        }

    }
}
