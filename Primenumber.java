import java.util.Scanner;
public class Primenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ask the user for the first and last number
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the last number: ");
        int m = sc.nextInt();
        // Loop through the range from n to m
        System.out.println("Prime numbers between " + n + " and " + m + " are:");
        for (int num = n; num <= m; num++) {
            Prime(num); // Call the Prime method to check and print primes
        }
        sc.close();
    }
    // Method to check and print if a number is prime
    public static void Prime(int num) {
        if (num <= 1) {
            return; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return; // Not a prime number if divisible by any number other than 1 and itself
            }
        }
        System.out.println(num);
    }
}



