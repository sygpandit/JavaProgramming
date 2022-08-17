//program to enter radius of a circle and display the area of the circle
import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r=sc.nextInt();
        double area=3.14*r*r;
        System.out.println("The area of the circle is "+area);
    }
}