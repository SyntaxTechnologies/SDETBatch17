package class2;
/*
In your program create different type of variables to store
student’s information(first name, last name, city, state, phone number)
and then print value of those variables in the format:
My First name is ___ and my  last name is ____
I live in city__ and state____
And my phone number is …..
My name is __
I moved to new city__ and new state__.
My new phone number is ___
 */
public class T3Variables {
    public static void main(String[] args) {
        String firstName="Uzair";
        String lastName="Baber";
        String city="Egypt";
        String state="VA";
        String phoneNumber="+1-235-2352-4587";
        System.out.println("My first name is "+firstName+" and my  last name is "+lastName);
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);
        city="honolulu";
        state="Hawai";
        phoneNumber="123-456-4789";
        System.out.println("My name is "+firstName);
        System.out.println("I moved to new city "+city+" and new state "+state);
        System.out.println("My new phone number is "+phoneNumber);

    }
}
