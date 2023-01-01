import java.util.Scanner;
class even_odd {

    // Write a program that will determine if a number is even or odd.
    public static void main(String[] args) { 
        Scanner kb = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int num = kb.nextInt(); // Read user input
        if (num % 2 == 0) { // If the remainder is 0, the number is even
            System.out.println("The number is even."); // Print the result
        } else { // If the remainder is not 0, the number is odd
            System.out.println("The number is odd."); // Print the result
        } 
        kb.close(); // Close the Scanner object
    }
}