import java.util.*;

public class GreaterValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x:");
        int x=sc.nextInt();

        System.out.println("Enter the value of y:");
        int y=sc.nextInt();

        greater(x,y);

    }
    public static void greater(int x , int y){
        if(x>y){
            System.out.println("the greater number x is equal to "+x);
        }else{
            System.out.println("the greater number y is equal to "+y);
        }
    }
    
}
