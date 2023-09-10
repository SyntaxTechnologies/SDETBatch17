package class20;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism

 */
public class Student1 {



    void homework() {
        System.out.println("Student is doing homework");
    }

    void exam() {
        System.out.println("student is taking an exam");
    }

    void study() {
        System.out.println("Student is studying");
    }

    void play() {
        System.out.println("Student likes to play Chess");
    }

    void extraCurricular() {
        System.out.println("Student likes to do extra curricular activites");
    }
}


class SyntaxStudent extends Student1 {
    void play() {
        System.out.println("Student likes to play cards");
    }
}



class CollegeStudent extends Student1 {
    @Override
    void extraCurricular() {
        System.out.println("Student likes to nap instead");

    }
}

class SchoolStudent extends Student1 {
    @Override
    void homework() {
        System.out.println("Student doesnt like to do homework, instead likes to chill all day");
    }

}
 class StudentTester1 {
    public static void main(String[] args) {
        Student1[] arr = {new Student1(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].play();
            arr[i].extraCurricular();

        }

    }
}
