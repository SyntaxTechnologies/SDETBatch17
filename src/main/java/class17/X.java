package class17;

public class X {
    String name;
    void printName(){
        System.out.println(name); 
    }
}

class Y extends X{
    String lastname;
    void printLastName(){
        System.out.println(lastname);

    }

}
class Z extends Y {
    int age;

    void printAge(){
        System.out.println(age);
    }

}