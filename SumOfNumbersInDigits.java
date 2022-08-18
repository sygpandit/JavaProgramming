//program to enter number and display the sum of digits in the number

import java.util.Scanner;

class SumOfNumbersInDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("The sum of digits in the number is "+sum);
    }
}