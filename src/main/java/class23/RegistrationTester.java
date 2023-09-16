package class23;

public class RegistrationTester {


        public static void main(String[] args) {
            Registration r = new Registration("giulia@yahoo.com", "User123", "Pass123");


            System.out.println("Email: " + r.getEmail());
            System.out.println("Username: " + r.getUsername());
            System.out.println("Password: " + r.getPassword());
        }
    }