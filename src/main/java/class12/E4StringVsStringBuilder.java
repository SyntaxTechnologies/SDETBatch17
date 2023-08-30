package class12;

public class E4StringVsStringBuilder {
    public static void main(String[] args) {

        String name1,name2,name3,name4;
        name1="United states of America";
        name2="United states of America";
        name3="United states of America";
        name4="United states of America";

        StringBuilder sb=new StringBuilder("Sunday");
        StringBuffer sf=new StringBuffer("Sunday");
        sb.reverse();
        sf.reverse();
    }
}
