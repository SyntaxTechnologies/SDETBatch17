package review9;

public class Calculator {

    void add(int a,int b){
        System.out.println(a+b);
    }

    int add(int ... arr){
      int sum=0;
      for (int a:arr){
          sum+=a;
      }
      return sum;
    }
}
