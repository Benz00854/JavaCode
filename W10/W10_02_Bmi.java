// เกณฑ์การตีความค่า BMI
// น้ำหนักน้อยกว่าเกณฑ์: BMI น้อยกว่า 18.5
// น้ำหนักปกติ: BMI อยู่ระหว่าง 18.5 - 24.9
// น้ำหนักเกิน: BMI อยู่ระหว่าง 25 - 29.9
// อ้วน: BMI ตั้งแต่ 30 ขึ้นไป

// BMI= น้ำหนัก(กิโลกรัม)/ ส่วนสูง(เมตร)xส่วนสูง(เมตร) 
// ตัวอย่าง น้ำหนัก 60 กิโลกรัม ส่วนสูง 1.7 เมตร
// BMI= 60/(1.7*1.7) = 20.76


package W10;
import java.util.Scanner;
public class W10_02_Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ป้อนน้ำหนักของคุณ (kg): ");
        double weightKG = scanner.nextDouble();
        
        System.out.print("ป้อนส่วนสูงของคุณ (cm): ");
        double heightCM = scanner.nextDouble();

        //แปลงค่าส่วนสูงจากเซนติเมตรเป็นเมตร
        double heightM = heightCM / 100;
        
        // คำนวณค่า BMI
        double bmi = weightKG / (heightM * heightM);
        
        System.out.println("ค่า BMI ของคุณคือ: " + bmi);
        
        // ตรวจสอบสถานะ BMI
        if (bmi < 18.5)  {
            System.out.println("คุณมีน้ำหนักน้อยกว่าเกณฑ์ : อยู่ในสถานะผอม");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("คุณมีน้ำหนักน้อยปกติ : อยู่ในสถานะปกติ");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("คุณมีน้ำหนักเกิน : อยู่ในสถานะท้วม");
        } else {
            System.out.println("คุณมีน้ำหนักเกินกว่าปกติมาก : อยู่ในสถานะอ้วน");
        }
        scanner.close();
    }
}