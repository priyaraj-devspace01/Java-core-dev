package com.org.innerClass;

 class LoginService {

    public void login(String username, String password) {

        // Local Inner Class
        class PasswordValidator {

            public boolean isValid(String pwd) {
                return pwd.length() >= 8 &&
                        pwd.matches(".*[A-Z].*") &&
                        pwd.matches(".*\\d.*");
            }
        }

        PasswordValidator validator = new PasswordValidator();

        if (validator.isValid(password)) {
            System.out.println("Login successful for " + username);
        } else {
            System.out.println("Password is too weak!");
        }
    }

}
public class localInnnerClass {
    public static void main(String[] args) {
        // it basically the class inside a method for temporary uses
        LoginService login = new LoginService();
        login.login("priyaraj", "Liku1234");

    }
}
