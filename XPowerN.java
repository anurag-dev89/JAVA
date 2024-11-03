import java.util.Scanner;

public class XPowerN {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter the value of x:");
        double x =sc.nextDouble();

        System.out.print("Enter the value of n:");
        double n=sc.nextDouble();

        calculatePower(x,n);

        sc.close();
        
    }
    public static void calculatePower(double x, double n) {
        double result = Math.pow(x, n);
    System.out.print("the value of x power n is :"+result);
        
    }
    
}
