package class15;

public class T1 {

    private String address;

    public T1(String userAddress) {
        address = userAddress;
        System.out.println("Executed constructor with parameter " + userAddress);

    }

    // Break till 1:52
    public T1() {
        System.out.println("Executed constructor with No parameters");
    }

    public static void main(String[] args) {
        new T1();
        new T1("Canada");

    }
}

