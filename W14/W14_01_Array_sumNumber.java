// โจทย์
// 1. สร้างโปรแกรมเพื่อแสดงข้อมูลทั้งหมดใน Array
// 2. หาผลรวมของข้อมูลทั้งหมดใน Array
// 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
// 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
// 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่

package W14;
import java.util.Scanner;
public class W14_01_Array_sumNumber {
    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
        int numbers [ ] = { 10, 30 , 17, 9, 31, 225, 64, 89, 5, 120} ; 

        // 1. แสดงรายการข้อมูลใน Array ทั้งหมด
        System.out.println("Data in Array are:");
        for (int i=0;i<numbers.length;i++ ) {
            System.out.print(numbers[i]+" ");

        }

        System.out.println("\n====================================");

        // 2. หาผลรวมของข้อมูลทั้งหมด
        int sum = 0;
        for (int i=0;i<numbers.length;i++ ){
            System.out.print(numbers[i]+" ");
            sum = sum+numbers[i]; //sum += numbers[i]
        }
        System.out.println("\nSum of number "+sum);
        System.out.println("====================================");

        // 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
        Scanner kb = new Scanner(System.in);
        int[] newNumbers = new int[5];
        for (int i=0;i<newNumbers.length;i++){
            System.out.print("Enter number "+(i+1)+": ");
            newNumbers[i] = kb.nextInt();

        }

        System.out.println("====================================");

        // 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
        // 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่

        System.out.println("Data in Array are:");
        sum = 0;
        for (int i=0;i<newNumbers.length;i++ ) {
            System.out.print(newNumbers[i]+" ");
            sum += newNumbers[i];
        }
        System.out.println("\nSum of Number = "+sum);

        System.out.println("\n====================================");

        // 6. รวม Array ข้อ 1 และ ข้อ 3 ให้เป็น Array ใหม่
        int[] mergeNumbers = new int[numbers.length + newNumbers.length];
        for (int i=0;i<numbers.length;i++){
            mergeNumbers[i] = numbers[i];
        }
        for (int i=0;i<newNumbers.length;i++){
            mergeNumbers[newNumbers.length+i] = newNumbers[i];
        }
        System.out.println("Data in Array are:");
        sum = 0;
        for (int i=0;i<mergeNumbers.length;i++ ) {
            System.out.print(mergeNumbers[i]+" ");
            sum = sum+mergeNumbers[i];
        }
        System.out.println("\nSum of Number = "+sum);
        System.out.println("\n====================================");
    }
}