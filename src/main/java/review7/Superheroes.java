package review7;

public class Superheroes {

    String name, power;
    int age;
    char gender;

    Superheroes(String name, String power){
        this.name=name;
        this.power=power;
    }

    Superheroes(String name, String power, int age){
        this(name, power); // this() ->making a call to the CURRENT class constructor
        this.age=age; // this. ->accessing CURRENT class instance variables
    }

    public static void main(String[] args) {
        Superheroes hero1=new Superheroes("Superman", "Fly");

        Superheroes hero2=new Superheroes("Batman", "Money",27);
    }
}
