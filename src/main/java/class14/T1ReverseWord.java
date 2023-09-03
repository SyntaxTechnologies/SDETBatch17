package class14;
/*
How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
 */
public class T1ReverseWord {

    public static void main(String[] args) {

        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.accountNumber);
        System.out.println(bankAccount.accountBalance);



        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String word=arr[i];
           String reversed= reverseStr(word);
            System.out.print(reversed+" ");
        }

    }

    static String reverseStr(String inputStr){

        String reversed="";
        for (int i = inputStr.length()-1; i>=0 ; i--) {
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;
    }
}
