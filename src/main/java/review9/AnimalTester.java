package review9;

public class AnimalTester {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.speak();
        d.sleep();

        Animal a=new Animal();
        a.speak();

        Animal c=new Dog();
        c.speak();

        int e=(int)10.5;
    }
}
