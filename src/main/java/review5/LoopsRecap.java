package review5;

public class LoopsRecap {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {
            //code to repeat
            System.out.println("Hello");
            System.out.println(i);
        }

        for(int i=2; i<=10; i+=3){

            System.out.println(i);
        }

        System.out.println(" Nested Loop");

        for(int i=1; i<3; i++) {

            System.out.println("Hello");

            for(int j=1; j<=4; j++) {

                System.out.println("Bye");
            }

        }

        System.out.println(" Nested Loop");

        for(int i=1; i<3; i++) {
            System.out.println("Hello");

            for(int j=1; j>=4; j++) {
                System.out.println("Bye");
            }
        }

        System.out.println(" Nested Loop");

        for(int i=1; i>3; i++) {
            System.out.println("Hello");
            for(int j=1; j<=4; j++) {
                System.out.println("Bye");
            }

        }

        System.out.println(" Nested Loop");

        for(int i=1; i<3; i++) {
            System.out.println("Hello");

            for(int j=1; j<=4; j++) {
                System.out.println("Bye");
            }
            break;
        }

        System.out.println(" Nested Loop");

        for(int i=1; i<3; i++) {
            System.out.println("Hello");

            for(int j=1; j<=4; j++) {
                System.out.println("Bye");
                break;
            }

        }

    }
}
