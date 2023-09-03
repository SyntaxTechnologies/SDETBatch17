package class15;

public class Car {


    private String make;
    private String model;
    private String color;
    private double price;

    public Car(String cMake, String cModel, String cColor, double cPrice) {
        make = cMake;
        model = cModel;
        color = cColor;
        price = cPrice;
    }

   public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price);
    }

    void setPrice(double cPrice){
        price=cPrice;
    }

    double getPrice(){
        return price;
    }

}
