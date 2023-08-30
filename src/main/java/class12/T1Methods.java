package class12;

/*
Create a method that will take 2 parameters as a numbers and
prints which number is larger.
 */
public class T1Methods {

  void printLarger(int num1,int num2){

      if(num1>num2){
          System.out.println("Larger number is "+num1);
      }else {
          System.out.println("Larger number is "+num2);
      }
  }

  /*
  Create a method that will take a number and prints whether
  the number is even or odd.
   */
  void checkEvenOdd(int num){

      if(num%2==0){
          System.out.println(num+" is an even number");
      }else {
          System.out.println(num+" is an odd number");
      }
  }

}
