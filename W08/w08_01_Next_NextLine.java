package W08;

import java.util.Scanner;

public class w08_01_Next_NextLine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your name1 : ");
        String name1 = kb.next();
        kb.nextLine();

        System.out.print("Enter your name2 : ");
        String name2 = kb.nextLine();

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        kb.close();
    }
}

// อธิบายปัญหา
// kb.next() อ่านค่าที่ป้อนเข้ามาจนกว่าจะเจอช่องว่างหรือ newline character (\n)
// และทิ้ง newline character ไว้ใน buffer
// kb.nextLine() ที่ตามมาจะอ่าน newline character ที่ค้างอยู่ใน buffer
// ทำให้ผลลัพธ์ที่ได้เป็นบรรทัดว่าง

// วิธีแก้ไข
// เพื่อให้การอ่านค่า string ทำงานได้อย่างถูกต้อง ควรเคลียร์ newline character
// ที่เหลืออยู่หลังจาก kb.next() ก่อนที่จะเรียก kb.nextLine()