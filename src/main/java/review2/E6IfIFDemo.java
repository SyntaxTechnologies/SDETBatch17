package review2;

public class E6IfIFDemo {
    public static void main(String[] args) {

        int age=61;
        if(age==60){
            System.out.println("You get 20% Discount");
        }

        if(age==50){
            System.out.println("You get 15% Discount");
        }

        if(age==40){
            System.out.println("You get 10% Discount");
        }
        else {
            System.out.println("No Discounts for you. Please try after 10 years");
        }
    }
}
