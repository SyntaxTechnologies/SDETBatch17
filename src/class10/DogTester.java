package class10;

public class DogTester {
    public static void main(String[] args) {
        // Creating an obj from the Dog class
        Dog lunasObj=new Dog();
        //assigning a value to name using lunasobj
        lunasObj.name="Luna";
        lunasObj.gender='F';
        lunasObj.breed="Shiba";
        lunasObj.weight=10;
        lunasObj.age=20;
        System.out.println(lunasObj.name);
        System.out.println(lunasObj.age);
        System.out.println(lunasObj.breed);
        // we are calling the bark method on lunasObj
        lunasObj.bark();
        // we are calling the eat method on lunasObj
        lunasObj.eat();
        // we are calling the sleep method on lunasObj
        lunasObj.sleep();


    }
}
