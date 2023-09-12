package review8;

public class E1LocalVariables {

    public static void main(String[] args) {
      //  System.out.println(country);
        String country="Uganda";
        {
            int age=10;
            System.out.println(country);
        }

        if(10>5){
            System.out.println(country);
            String name="Wanda";
        }
        System.out.println(country);
     //   System.out.println(name);

      //  System.out.println(age);
    }
}
