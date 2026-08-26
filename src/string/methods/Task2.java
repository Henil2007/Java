package string.methods;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        String statement;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value : ");
        statement = sc.nextLine();

        String[] parts = statement.split("\\s");

        String date = parts[0];

        String time = parts[1];

        String logLevel = parts[2];

        String service = parts[3];

        String email = statement.substring(statement.lastIndexOf(":") + 2);

        boolean errorFound = statement.contains("ERROR");

        String username = email.substring(0, email.indexOf("@"));

        System.out.println("Date          : " + date);
        System.out.println("Time          : " + time);
        System.out.println("Log Level     : " + logLevel);
        System.out.println("Service       : " + service);
        System.out.println("Email         : " + email);
        System.out.println("Username      : " + username);
        System.out.println("Error Found   : " + (errorFound ? "Yes" : "No"));
        
        sc.close();
    }
}