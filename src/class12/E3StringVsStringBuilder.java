package class12;

public class E3StringVsStringBuilder {
    public static void main(String[] args) {
        String name="Baber";
        name.toLowerCase();
        System.out.println(name);

        StringBuilder sb=new StringBuilder("Sunday");
        sb.reverse();
        System.out.println(sb);
    }
}
