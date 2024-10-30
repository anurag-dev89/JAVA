import java.util.*;

public class SumOfOdd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        SumOfOdd(n);

    }
    public static void SumOfOdd(int n){
        int sum=0;

        for(int i=1;i<=n;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }

        System.out.println("sum of "+ n +" odd number is "+sum);
        

    }
    
}
