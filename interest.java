import java.util.Scanner;
public class interest {
    // Write a program that will determine the simple interest given the principal amount, rate of interest and time period.
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int principal, rate, time;
        System.out.print("Enter the principal amount: ");
        principal = kb.nextInt();
        System.out.print("Enter the rate of interest: ");
        rate = kb.nextInt();
        System.out.print("Enter the time period: ");
        time = kb.nextInt();
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + simpleInterest);
        kb.close();

    }
}
       