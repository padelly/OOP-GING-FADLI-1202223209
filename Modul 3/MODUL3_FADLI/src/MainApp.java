import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // TO DO : Create a Scanner object to receive input from the user
        Scanner scanner = new Scanner(System.in);
        // TO DO : Create Bioskop and Cashier objects
        Bioskop bioskop = new Bioskop();
        Bioskop cashier = new Cashier();
        // TO DO : Take the name from the user, make sure it is not empty
        User user = new User();
        // TO DO : Take the phone number from the user, make sure it is valid
        user.getnoHandPhone();
        // TO DO : Create a code for ticket order
        
        // TO DO : Create a exception if user enter not number

        // TO DO : Create a exception if user enter number is out of range

        // TO DO : Call the method to reserve seats in the cinema

        // TO DO : Close the Scanner object when the user is finished
        scanner.close();   
    }
}