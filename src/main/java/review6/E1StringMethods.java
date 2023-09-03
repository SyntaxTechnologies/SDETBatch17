package review6;

public class E1StringMethods {
    public static void main(String[] args) {

        String userName = "User123";
        String s = new String("User123");
        System.out.println(userName.length());
        int len = userName.length();
       if(len<8){
           System.out.println("Too short for a userName");
       }

    }
}
