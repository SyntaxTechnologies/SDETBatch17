package review10;

import java.math.BigInteger;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        // cat act  => act act
        String s1 = "adam";
        String s2 = "silent";

        char[] c1 = s1.toLowerCase().toCharArray(); //{c,a,t}
        char[] c2 = s2.toLowerCase().toCharArray(); //{a ,c ,t}
        Arrays.sort(c1);   //{a,c,t}
        Arrays.sort(c2);  //{a,c,t}
        boolean isAnaGram = Arrays.equals(c1, c2);
        System.out.println(isAnaGram);


      /*  BigInteger b=new BigInteger("132123131551313132131543132154534135453435435413543535");
        b.add(new BigInteger("1"));
        System.out.println();*/
        System.out.println(Integer.parseInt("125d"));

    }
}
