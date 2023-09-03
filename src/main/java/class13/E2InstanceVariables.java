package class13;

public class E2InstanceVariables {
    String name="Hind";

    void printAge(){
        int age=25;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);

    }
    void printCountry(){
       // System.out.println(age); error its a local variable can't be accessed here
        System.out.println(name);
        System.out.println(country);
        if(10>5){
            System.out.println(country);
        }
    }

   static String country="Uganda";
}
