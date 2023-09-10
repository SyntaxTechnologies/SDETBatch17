package class20;

public class E7Final {
    public static void main(String[] args) {

        final int AGE=12;
        //AGE=20;
        System.out.println(AGE);

    }
}
final class Parent{

   final String color="Red";
   final void marry(){
        System.out.println("take our permission first");
    }

}

/*class Child extends Parent{
  *//*  @Override
    void marry(){
        System.out.println("I want to marry someone else");
    }*//*
}*/
