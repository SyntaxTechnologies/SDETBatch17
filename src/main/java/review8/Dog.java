package review8;

public class Dog {
    String name;
    String color;
    String breed;

    public  Dog(){

        int a=10;
        System.out.println(a);

    }

    public void hopeYouCanStillSleepToday(){
        int a=10;
        System.out.println(a);
        if(10>20){
            return;
        }else{
            System.out.println("Hey");
        }


    }

    public static Dog getInstance(){
        Dog d=new Dog();
        return d;
    }
    public void add(int num1, int num2) {
       int sum = num1 + num2;
        System.out.println(sum);
    }
}

class DogTester {


    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "kacy";
        d.color = "Green";
        Dog d2 = new Dog();
        d2.name = "Chum";
        d2.color = "Black";
    }
}
