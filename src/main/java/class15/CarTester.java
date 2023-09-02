package class15;

public class CarTester {
    public static void main(String[] args) {

        Car c1=new Car("Toyota","Camry","white",35000);
        c1.printInfo();
        c1.setPrice(30000);
        c1.printInfo();
        System.out.println(c1.getPrice());
    }
}
