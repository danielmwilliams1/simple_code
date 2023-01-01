import java.util.Scanner;
public class largest_number { 
    // Write a program that will determine the greatest number among three numbers that are entered by the user.
    public static void main (String [] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = kb.nextDouble();
        System.out.print("Enter the second number: ");
        double b = kb.nextDouble();
        System.out.print("Enter the third number: ");
        double c = kb.nextDouble();
        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }
        kb.close();
    
    }
}
