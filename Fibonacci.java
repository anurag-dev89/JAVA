import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n=sc.nextInt();

        //find  the nth Fibonacci number
        fibo(n);

      sc.close();
    }
    //function for  fibonacci series
    public static void fibo(int n){
        int first=0;
        int second=1;

        for(int i =0;i<n;i++){
            System.out.println(first); 
            int next=first+second;
            first=second;
            second=next;
        }

    }
    
}
