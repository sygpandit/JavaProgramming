// Program to check palindromity of given number

import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            sum=sum*10+n%10;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}