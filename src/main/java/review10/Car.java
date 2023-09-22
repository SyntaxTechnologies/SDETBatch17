package review10;

public class Car implements WashAble{
    public  void drive(){
        System.out.println("driving........");
    }

    @Override
    public void wash() {
        System.out.println("You can take a car to carWash service");
    }
}

class Horse implements WashAble{

    @Override
    public void wash() {
        System.out.println("Horse can wash themselves ");
    }
}