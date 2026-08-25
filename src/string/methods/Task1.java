package string.methods;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name : ");
        String name = sc.nextLine();

        System.out.println("Original Name : " + name.trim());

        name = name.trim();

        name = name.replaceAll("\\s+", " ");

        String words[] = name.split("\\s+");

        StringBuilder cleanedName = new StringBuilder();

        for (String word : words) {

            String cleanWord = word.toUpperCase().charAt(0) + word.substring(1).toLowerCase();
            cleanedName.append(cleanWord).append(" ");
        }

        System.out.println("Cleaned Name : " + cleanedName.toString().trim());
        System.out.println("Word Count : " + words.length);
        System.out.println("Status : Valid Customer Name");

        sc.close();
    }
}