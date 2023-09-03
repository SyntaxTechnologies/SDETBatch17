package class16;

public class CatTester {
    public static void main(String[] args) {
        Cat c1=new Cat("Bubbles","Bul'ka","black",5);
        c1.printInfo();

        Cat c2=new Cat();
        c2.printInfo();

        Cat c3=new Cat("Bubbles","Bul'ka","black",5,'M');
        c3.printInfo();

        Cat c4=new Cat("Bubbles","Bul'ka","black",5,'M',25);
        c4.printInfo();
    }
}