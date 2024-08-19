package W10;

public class W10_01_PrePostOperator {
    public static void main(String[] args) 
    {
        int a = 5;
        int b =5+ a--; // a ถูกเพิ่มค่าเป็น 6 ก่อนที่จะถูกกำหนดค่าให้กับ b

        System.out.println("a = " + a); // a = 6
        System.out.println("b = " + b); // b = 6        
  
        //----------------------------------------------
        
        int c = 5;
        int d = c++; // ค่าเริ่มต้นของ c ถูกกำหนดให้กับ d ก่อนที่ c จะถูกเพิ่มค่าเป็น 6
        
        System.out.println("c = " + c); // c = 6
        System.out.println("d = " + d); // d = 5
        
        //----------------------------------------------



    } 
}

// สรุป
// Pre-operation (++a หรือ --a): ตัวดำเนินการจะถูกดำเนินการก่อนที่จะใช้ค่าของตัวแปร
// Post-operation (a++ หรือ a--): ตัวดำเนินการจะถูกดำเนินการหลังจากที่ค่าของตัวแปรถูกใช้