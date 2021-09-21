package class_test;

import java.util.Scanner;

public class EmailValidation {

    public static final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Za-z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

    public static void main(String[] args) {

        EmailValidation obj = new EmailValidation();

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your email address: ");
        String email = sc.nextLine();

        if (email.contains("@")) {
            System.out.println(" email is valid");
        } else {
            System.out.println(" email invalid");
        }

        /*
        
         boolean isValid = obj.isValidEmail(email);
        if (isValid) {
            System.out.println( email+ "      Email is Valid");
        } else {
            System.out.println(email+ "       Emai is not Valid");
        }
        
         */
    }

    private boolean isValidEmail(String email) {

        if (email.toUpperCase().matches(VALID_EMAIL_ADDRESS_REGEX)) {
            return true;
        }
        return false;
    }
}
