package class5;

public class E8ANDOperator {
    public static void main(String[] args) {


        boolean goodCredit=false;
        boolean stableJob=true;
        boolean minimumAge=false;
        if(goodCredit&&stableJob&&minimumAge){
            System.out.println("You can have the loan");
        }else {
            System.out.println("You need to fulfill all the requirements");
        }



    }
}
