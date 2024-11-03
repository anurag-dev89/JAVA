import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        // Find and print GCD
        findGcd(a, b);

        scanner.close();
    }

    // Function for finding GCD
    public static void findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // Correctly calculating the new value of b
            a = temp;
        }
        System.out.println("The GCD is: " + a);
    }
}

