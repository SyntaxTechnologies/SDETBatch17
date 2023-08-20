package class10;

public class PhoneTester {
    public static void main(String[] args) {

        Phone iphoneObj = new Phone();
        iphoneObj.make = "Apple";
        iphoneObj.model = "Iphone 14";
        iphoneObj.os = "IOS 17";
        iphoneObj.price = 999;
        iphoneObj.sendText();
        iphoneObj.call();

        Phone pixelObj = new Phone();
        pixelObj.make = "Google";
        pixelObj.model = "Pixel 7";
        pixelObj.os = "Android 13";
        pixelObj.price = 699;
        pixelObj.sendText();
        pixelObj.call();


        Phone samsungObj = new Phone();
        samsungObj.make = "Samsung";
        samsungObj.model = "S23 Ultra";
        samsungObj.os = "Android 13";
        samsungObj.price = 1199;
        samsungObj.sendText();
        samsungObj.call();


    }
}
