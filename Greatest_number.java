public class Greatest_number {
    // Write a program that will determine the greatest number among three numbers.
    public static void main (String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("The greatest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }
    }
    
}
