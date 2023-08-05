package class5;

public class E5OROperator {
    public static void main(String[] args) {

       boolean broughtFlowers=false;
       boolean broughtChocolates=false;
       boolean allMyMistake=false;

       if(broughtChocolates||broughtFlowers||allMyMistake){
           System.out.println("Wife is happy");
       }else {
           System.out.println("Wife is Sad");
       }
    }
}
