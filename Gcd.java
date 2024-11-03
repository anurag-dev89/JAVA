import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the value of a : ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b : ");
        int b = scanner.nextInt();

        // Find and print GCD
        System.out.println("The Gcd is: " + findGcd(a, b));

        scanner.close();
    
    }
       //function for finding gcd
    public static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

