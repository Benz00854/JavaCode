import java.util.Scanner;                           //นำเข้าคลาส Scannner จาก package java.util
public class W04_02_ifElse_CompareNumber {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);     //สร้าง Objeat ของคลาส Scanner
        System.out.print("Enter first number : ");  //แสดงข้อความที่ให้ผู้ใช่ป้อนตัวเลขที่ต้องการช่องที่ 1
        int num1 = input.nextInt();                 //รับตัวเลขที่ผู้ใช่ป้อนและเก็บในตัวแปร num1
        System.out.print("Enter second number : "); //แสดงข้อความที่ให้ผู้ใช่ป้อนตัวเลขที่ต้องการช่องที่ 2
        int num2 = input.nextInt();                 //รับตัวเลขที่ผู้ใช่ป้อนและเก็บในตัวแปร num2
        int result = 0;           //ตั้งค่าเริ่มต้นของ result
        if(num1>num2) {           //กำหนดเงื่อนไข
            System.out.println("The number 1 is greater than the number 2");
            result = num1-num2;   //ถ้าเป็นจริง
        }else {
            System.out.println("The number 1 is less than the number 2");
            result = num1+num2;   //ถ้าไม่เป็นจริง
        }
        System.out.println("The result is : "+result);     //แสดงผล
        
    }
}