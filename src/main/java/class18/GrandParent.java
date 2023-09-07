package class18;

public class GrandParent {
    public GrandParent(){
        System.out.println("Granpa");
    }
}
class Parent extends GrandParent{
    public Parent(){
        System.out.println("Parent");
    }
}

class Children extends Parent{
    Children(){
        System.out.println("Children");
    }
}
class Tester{
    public static void main(String[] args) {

        Children c=new Children();
    }
}