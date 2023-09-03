package class2;
/*
Write a Java program to add, subtract, multiply and divide 2 decimal values.
Your program should say.
“The _______ of two numbers ___ and ___ is equal to _____”  Break till 1:50
 */
public class T4 {
    public static void main(String[] args) {
        double num1=21.0;
        double num2=5.5;
        double addResults=num1+num2;
        double subResults=num1-num2;
        double mulResults=num1*num2;
        double divResults=num1/num2;
        System.out.println("The Addition of two numbers "+num1+" and "+num2+" is equal to "+addResults);
        System.out.println("The subtraction of two numbers "+num1+" and "+num2+" is equal to "+subResults);
        System.out.println("The multiplication of two numbers "+num1+" and "+num2+" is equal to "+mulResults);
        System.out.println("The division of two numbers "+num1+" and "+num2+" is equal to "+divResults);
    }
}
