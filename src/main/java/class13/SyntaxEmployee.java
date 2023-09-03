package class13;
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects

 */
public class SyntaxEmployee {

    String empId;
    int salary;
    static String CEO="Sumair";


    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.empId="I123";
        asghar.salary=-20;

        SyntaxEmployee moazzam=new SyntaxEmployee();
        moazzam.empId="I456";
        moazzam.salary=95;

        System.out.println(moazzam.salary);
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(moazzam.CEO);
        System.out.println(asghar.CEO);

    }

}
