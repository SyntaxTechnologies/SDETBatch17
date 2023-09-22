package review10;

public interface WashAble {
    public void wash();
}

class WashAbleTester{
    public static void main(String[] args) {
        WashAble [] arr={new Car(),new Horse()};
        for (WashAble w:arr){
            w.wash();
        }
    }

}