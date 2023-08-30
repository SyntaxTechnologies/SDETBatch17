package class11;

public class E6StringMethods {
    public static void main(String[] args) {

        String str="ks d nfjA ZSX232 98 ()4!@# %^&A S";
        System.out.println(str.replaceAll("[A-Z]","="));
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll("[&-;]",""));

    }
}
