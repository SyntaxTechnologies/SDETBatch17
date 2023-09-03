package class15;
/*


Returns:

```
an integer
```

Name:

```
sumEvenToX
```

Parameters:

```
an integer called "x"
```

Purpose:

```
calculate the sum of the EVEN integers from 1 to x (including x)
```

Examples:

```
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20
 */
public class Repl {

    public static void main(String[] args) {
        // 2 4 6 8 10
        System.out.println(sumEvenToX(10));
    }
   static int sumEvenToX(int x){
        int sum=0;
        for (int i = 2; i <=x ; i=i+2) {
            sum=sum+i;
        }
        return sum;
    }

}
