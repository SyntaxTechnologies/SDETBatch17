package class9;

/*
Create a 2D array(shorter way) in which first array will
consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade
 */
public class T32DArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Aysha", "Giulia", "John", "Deepali" },
                {"A", "A+", "C", "B" }
        };
        for (int i = 0; i < students[0].length; i++) {
            if(students[1][i].equals("A") ||students[1][i].equals("B")){
            System.out.println(students[0][i]);}
        }

    }
}
