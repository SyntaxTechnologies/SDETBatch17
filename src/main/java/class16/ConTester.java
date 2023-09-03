package class16;
/*
Write a java class that have 4 constructors with 4 different access
levels of constructors(private,public,default,protected) and create 4
objects of this class:
1 - inside same class;
2 - from outside the class;
3 - from different class inside different package  and observe result.
 */
public class ConTester {

    private ConTester(){
        System.out.println("Private");
    }

     ConTester(String name){
        System.out.println("Default");
    }

    protected ConTester(int age){
        System.out.println("protected");
    }

    public ConTester(double weight){
        System.out.println("public");
    }

    public static void main(String[] args) {

        new ConTester();
        new ConTester("dnfdkj");
        new ConTester(1512);
        new ConTester(10.52155);

    }
}
