package class19;

import java.net.SocketTimeoutException;

public class Calculator {

     void add(int num1,int num2){
        System.out.println(1);
        System.out.println(num1+num2);
    }


    public void add(int num1,int num2,int num3){
        System.out.println(2);
        System.out.println(num1+num2+num3);
    }

    public void add(double num1,double num2){
        System.out.println(3);
        System.out.println(num1+num2);
    }

    public void add(int num1,double num2){
        System.out.println(4);
        System.out.println(num1+num2);
    }

    public void add(double num1,int num2){
        System.out.println(5);
        System.out.println(num1+num2);
    }

}
