package W08;

import java.util.Scanner;

public class w08_04_MathOperator {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("กรุณาป้อนตัวเลขที่ 1 : ");
        double num1 = kb.nextDouble();

        System.out.print("กรุณาป้อนตัวเลขที่ 2 : ");
        double num2 = kb.nextDouble();

        System.out.println("ค่าของตัวแปร num1 = " + num1);
        System.out.println("ค่าของตัวแปร num2 = " + num2);
        System.out.println("ผลบวก = " + (num1 + num2));
        System.out.println("ผลลบ = " + (num1 - num2));
        System.out.println("ผลคูณ = " + (num1 * num2));
        System.out.println("ผลหาร = " + (num1 / num2));
        System.out.println("ผลหารเอาเศษ = " + (num1 % num2));

        kb.close();
        System.out.println("======================================");

        // ตัวอย่างการใช้งานคำสั่ง Math
        double a = Math.sqrt(16); // รากที่สองของ 16
        double b = Math.pow(2, 3); // 2 ยกกำลัง 3
        double c = Math.sin(Math.PI / 2); // sine ของ 90 องศา
        double d = Math.round(4.6); // ปัดเศษ 4.6
        double e = Math.max(5, 10); // ค่ามากสุดระหว่าง 5 และ 10

        System.out.println("Square root of 16: " + a);
        System.out.println("2 raised to the power of 3: " + b);
        System.out.println("Sine of 90 degrees: " + c);
        System.out.println("Rounded value of 4.6: " + d);
        System.out.println("Maximum of 5 and 10: " + e);

    }
}

// ดูเพิ่มเติมได้ที่
// https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/lang/Math.html