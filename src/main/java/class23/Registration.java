package class23;

public class Registration {

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);
    }

    public void setEmail(String email) {

        if (email.contains("yahoo")){
            this.email = email;
        }else{
            System.out.println("not a accepted email provider");
        }
    }

    public void setUserName(String userName) {

        if(!userName.isEmpty()&& userName.length()>6){
            this.userName = userName;
        }else{
            System.out.println("Username does not meet requirements.");
        }
    }

    public void setPassword(String password) {

        if(!password.isEmpty()&& password.length()>6&& password!=userName){
            this.password = password;
        }else{
            System.out.println("Password does not meet requirements.");
        }
    }

    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}