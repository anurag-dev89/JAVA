import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while(true) {
            System.out.print("Enter a number (or 'q' to quit): ");
            String input = scanner.next();

            if(input.equals("q")){
                break;
            } else {
                int number = Integer.parseInt(input);
                
                if (number == 0) {
                    zeroCount++;
                } else if (number > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
            }
        }

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        scanner.close();
    }
}