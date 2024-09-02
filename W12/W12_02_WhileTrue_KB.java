package W12;

import java.util.Scanner;

public class W12_02_WhileTrue_KB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true){                                   // วนลูปไปเรื่อยๆ ใช้ while (true)
            System.out.print("Enter Number : ");      // แสดงข้อความ Enter Number :
            int number = kb.nextInt();                  // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number

            if(number == 0) {                           // ตรวจสอบเงื่อนไข ถ้า number เท่ากับ 0 ให้ออกจากลูป //เขียนย่อได้ if (number == 0) break;
                break;                                  // ออกจากลูป
            }
        }   
    }
}