import java.util.Scanner;                            //นำเข้าคลาส Scannner จาก package java.util
public class W04_01_Areacircle {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);         //สร้าง Objeat ของคลาส Scanner
        System.out.print("Enter radius circle: ");   //แสดงข้อความที่ให้ผู้ใช่ป้อนค่ารัสมี
        double radius = sc.nextDouble();             //รับค่ารัสมีที่ผู้ใช่ป้อนและเก็บในตัวแปร radius
        // double radius;//ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 10;  //กำหนดค่ารัศมีเป็น 10
        double area;                                 //ประกาศตัวแปรค่าพื้นที่
        double pi = 3.14159;                         //ประกาศค่าคงที่ pi
        area = pi*radius*radius;                     //คำนวณพื้นที่ของวงกลม
        System.out.println("Area circle = "+area);
    }
}