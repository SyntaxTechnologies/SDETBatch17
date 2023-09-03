package class15;

public class Student {

    private String name;
    private double marks1;
    private double marks2;
    private double marks3;

    public Student(String sName, double sMarks1, double sMarks2, double sMarks3) {
        name = sName;
        marks1 = sMarks1;
        marks2 = sMarks2;
        marks3 = sMarks3;
    }

    public void printAvg(){

        double avg=(marks1+marks2+marks3)/3;
        System.out.println(name+ " Got "+avg);

    }
    public void printName(){
        System.out.println(name);
    }
}
