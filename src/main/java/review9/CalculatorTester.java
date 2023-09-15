package review9;

import org.checkerframework.checker.units.qual.C;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator c=new Calculator();
     // int s=  c.add(10,20);
        int result=c.add(10,20,30);
        System.out.println(c.add(10,20,30,40,50));
    }
}
