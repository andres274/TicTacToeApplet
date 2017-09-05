/**
 * Purpose "Hello username, Welcome to CSC200 class! and Your password is XXXXXX".
 * @author Andres Montenegro
 */

import java.util.Scanner;

public class HelloMyName {
    public static void main(String[] args) {
        String username, password;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username");
        username = keyboard.nextLine();
        System.out.println("Enter password");
        password = keyboard.nextLine();
        System.out.println("Hello " + username + ",Welcome to CSC200 class! and Your password is " + password);
    }
}
