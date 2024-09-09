package W13;
import java.util.Scanner;
public class W13_02_introArray{
    public static void main(String [] args){
        //ประกาศตัวแปรชนิด Array แบบที่ 2 : ไม่รู้จำนวนล่วงหน้า
        String[]brandCars = new String[3];
        
        Scanner kb = new Scanner(System.in);
        //กำหนดค่าให้กับ Array
        brandCars[0] = "Toyota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";

        //แสดงผลลัพธ์โดยใช้ Loop
        System.out.println("Default Brand of cars in the array are : ");
        for(int i=0;i<brandCars.length;i++){
            System.out.print(brandCars[i]+" / ");
        }
        
        System.out.println("\n=============================================");
        //แก้ไขค่าใน Array โดยรับต่าจากคีย์บอร์ด
        System.out.println("Please enter the brand of the 3rd car : ");
        for(int i=0;i<brandCars.length;i++){
            System.out.print("Enter brand "+(i+1)+": ");
            brandCars[i] = kb.next();
        }

        System.out.println("\n=============================================");
        //ใช้ for-each Loop
        brandCars[3] = "BMW";
        System.out.println("Brand of cars in the array are : ");
        for(String car : brandCars){
            System.out.print(car +" / ");
        }
    }
}