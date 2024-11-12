/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lucas
 */

import java.util.Scanner;

public class HomeworkProgramming {

    public static void main(String[] args) {
        // Read user input using scanner
        Scanner scanner = new Scanner(System.in);

        // Request the user's name and verify that it is correct
        String userName = askUserForText("Please enter your name:", scanner);
        // 
        scanner.close();

        // Show the updated name
        System.out.println("Modified name: " + modifyName(userName));
    }

    // Request a real name with no numerals
    public static String askUserForText(String prompt, Scanner scanner) {
        String input;
        while (true) {
            System.out.println(prompt);
            input = scanner.nextLine();

            // Verify that it just contains letters
            if (input.matches("[a-zA-Z]+")) {
                return input; // A real name
            } else {
                // If incorrect, indicate the error and re-ask
                System.out.println("Error: Name cannot contain numbers. Try again.");
            }
        }
    }

    // Update the name
    public static String modifyName(String name) {
        // Change it to capital letters
        String upperName = name.toUpperCase();

        // Change the name 
        String reversedName = new StringBuilder(upperName).reverse().toString();

        // Insert a suffix
        String modifiedName = reversedName + "_MOD";

        return modifiedName; // Return back the modified name
    }
}