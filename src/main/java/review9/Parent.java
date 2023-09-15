package review9;

public class Parent {
    String name="James";

    void printHello(){
        System.out.println("Hello World");
    }

    Parent(){
        System.out.println("Parent class constructor");
    }
    Parent(String n){
        System.out.println("Parent class with parameter");
    }
}
class Child extends Parent{
    String name="John";
    void printHello(){
        System.out.println("Hello Java");
    }

    void test(){
        String name="White";
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
    void methodTest(){
        super.printHello();
    }
    public Child(){
    super("Tamim");
    }
}
