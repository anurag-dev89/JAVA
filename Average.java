import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values you want to average:");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value " + (i + 1) + ":");
            double value = sc.nextDouble(); //use for taking decimal values
            sum += value; // Add the value to the sum
        }

        double average = sum / n; // Calculate the average
        System.out.println("The average of the values is: " + average);

        sc.close();
    }
}
