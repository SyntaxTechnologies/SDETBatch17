package class19;

import org.checkerframework.checker.builder.qual.NotCalledMethods;

public class Degree {

    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma :");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {


    public void getPrerequisite() {

        System.out.println("You will get master if you have bachelor degree");
    }


    void check(){

    }
}

class Tester {
    public static void main(String[] args) {
        Degree obj2 = new Degree();
        obj2.getPrerequisite();
        Bachelors obj1 = new Bachelors();
        obj1.getPrerequisite();
        Masters obj = new Masters();
        obj.getPrerequisite();
    }
}