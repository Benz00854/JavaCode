import java.util.Scanner;
public class W04_01_Areacircle_Homework {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius circle : ");
        double radius = sc.nextDouble();
        double area = 0;
        if(radius > 0) {
            area = pi*radius*radius;
            System.out.println("Area circle = "+area);
        }else{
            System.out.println("Please enter radius circle greater than 0");
        }
    }
}