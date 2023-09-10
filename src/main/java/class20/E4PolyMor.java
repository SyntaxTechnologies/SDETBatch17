package class20;

public class E4PolyMor {
    public static void main(String[] args) {
       /* Animal a=new Animal();
        a.speak();
        a.sleep();
        a.eat();
        Dog d=new Dog();
        d.speak();
        d.sleep();
        d.eat();
        Cat c=new Cat();
        c.speak();
        c.eat();
        c.sleep();*/

        Animal[] arr={new Cat(),new Dog(),new Animal()};
        for (Animal a : arr) {
            a.eat();
            a.sleep();
            a.speak();

        }

     /*   for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].sleep();
            arr[i].speak();

        }*/

    }
}
