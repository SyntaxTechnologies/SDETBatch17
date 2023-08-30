package class9;

public class E22DArrays {
    public static void main(String[] args) {

        String[][] names =
                {       {"Hind", "Mikhail", "Ismael", "Ahmed" },
                        {"John", "Bob", "Adam", "Tamim" },
                        {"Joke", "Laugh", "John Ahmed", "Mohammad" },
                        {"Gui", "Backend", "Front", "API" }

                };

        String[] row = names[2];
      //  System.out.println(row[3]);
       // System.out.println(Arrays.toString(firstRow));
        for(String ahmed:row){
            System.out.println(ahmed);
        }

    }
}
