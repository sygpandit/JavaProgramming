//Program to enter 2 numbers and display the sum of the two numbers
import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        int c=a+b;
        
        System.out.println("The sum of the two numbers is "+c);
    }
}