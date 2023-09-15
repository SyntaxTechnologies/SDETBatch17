package review9;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith", 35, 35000);
        Tester tester = new Tester("Adam", "Smith", 15,45000, "java");

        employee.print();
        tester.print();

    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void print() {
        System.out.print(firstName + " " + lastName + " " + age+" ");

    }
}

class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(salary);
    }
}

class Tester extends Person {
    private String programmingLanguages;

    public Tester(String firstName, String lastName, int age, int salary, String programmingLanguages) {
        super(firstName, lastName, age);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(programmingLanguages);
    }
}