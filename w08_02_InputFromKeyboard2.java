package W08;

import java.util.Scanner;

public class w08_02_InputFromKeyboard2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter your ID : ");
        long id = kb.nextLong();
        kb.nextLine();
        // System.out.print("Enter your name and surname : ");
        // String name = kb.next();
        System.out.print("Enter your name and surname : ");
        String name = kb.nextLine();

        System.out.print("Enter your age : ");
        int age = kb.nextInt();
        kb.nextLine();

        System.out.print("Enter your GPA : ");
        double gpa = kb.nextDouble();
        kb.nextLine();

        System.out.println(id + " " + name + " " + age + " " + gpa);
        kb.close();
    }
}

// เมื่อเราใช้เมธอดเหล่านี้ เช่น nextLong() หรือ nextInt()
// เพื่ออ่านตัวเลขจากคีย์บอร์ด ตัวเลขจะถูกอ่านเข้ามาอย่างถูกต้อง แต่ newline
// character (\n) ที่เกิดจากการกด Enter จะยังคงอยู่ใน buffer ของ Scanner
// ซึ่งส่งผลให้เมธอด nextLine() ที่ตามมาอ่าน newline character
// แทนการอ่านบรรทัดถัดไป

// ตัวอย่างการทำงานของ buffer
// ป้อนข้อมูลสำหรับ nextLong(): เมื่อเราป้อน 11111111 แล้วกด Enter, 11111111\n
// จะอยู่ใน buffer
// nextLong() อ่านค่า: เมธอด nextLong() จะอ่าน 11111111 และปล่อยให้ \n
// ค้างอยู่ใน buffer
// nextLine() ถัดมา: เมธอด nextLine() จะอ่าน \n ที่ค้างอยู่ใน buffer
// และส่งกลับเป็นบรรทัดว่าง

// วิธีแก้ไข
// การเรียก kb.nextLine(); หลังจาก nextLong() และ nextInt() เพื่อเคลียร์ newline
// character ที่ค้างอยู่ใน buffer จะทำให้ nextLine()
// ถัดไปอ่านค่าบรรทัดที่ต้องการได้อย่างถูกต้อง

// kb.next() จะอ่านเพียงคำเดียว (string ที่ไม่มี space)
// ดังนั้นเมื่อป้อนชื่อและนามสกุล Enter your name and surname : เช่น John Doe
// จะอ่านได้เพียง John ส่วน Doe จะถูกเก็บใน buffer
// ซึ่งอาจสร้างปัญหาต่อการอ่านค่าถัดไป