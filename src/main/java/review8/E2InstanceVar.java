package review8;

public class E2InstanceVar {

    String name;

    void printName(){
        System.out.println(name);
    }

    void PrintInformation(){
        System.out.println(name);
    }

    static void printInfo(){
        //System.out.println(name);
    }

    public static void main(String[] args) {


        E2InstanceVar.printInfo();


    }
}
