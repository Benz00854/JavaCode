package W10;
import java.util.Scanner;
public class W10_03_login {
    public static void main(String [] args){
        // สร้างตัวแปร username และ password
        String username = "admin";
        String password = "1234";

        Scanner kb = new Scanner(System.in);
        //สร้างตัวแปรเก็บ username และ password ที่ผู้ใช้ป้อนเข้ามา
        System.out.print("ป้อนชื่อผู้ใช้: ");
        String inputUsername = kb.nextLine();

        System.out.print("ป้อนรหัสผ่านผู้ใช้: ");
        String inputPassword = kb.nextLine();
        
        if(username.equals(inputUsername) && password.equals (inputPassword)){
            System.out.print("เข้าสู่ระบบสำเร็จ");
        }else{
            if(!username.equals(inputUsername) && password.equals(inputPassword)){
                System.out.print("ชื่อผู้ใช้ไม่ถูกต้อง");
            }else if(username.equals(inputUsername) && !password.equals(inputPassword)){
                System.out.print("รหัสผ่านไม่ถูกต้อง");
            }else{
                System.out.print("ชื่อผู้ใช้และรหัสผ่านไม่ผู้ต้อง");
            }
        }
    }
}