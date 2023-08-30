package class13;

public class Dog {
    String name;
    String breed;
    int age;

    void printInfo(){
        System.out.println(name+" "+breed+" "+age);
    }

    void printName(){
        System.out.println(name);
    }

    void changeName(String dogName){
        name=dogName;
    }

}
