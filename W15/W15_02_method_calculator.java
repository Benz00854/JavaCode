package W15;

public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    // 1) Method สำหรับบวกเลข
    static int plus(int a, int b){
        System.out.println(a+"+"+b+"= "+(a+b));
        return a+b;
    }

    // 2) Method สำหรับลบเลข
    static int minus(int a, int b){
        System.out.println(a+"-"+b+"= "+(a-b));
        return a-b;
    }


    // 3) Method สำหรับคูณเลข
    static int multiply(int a, int b){
        System.out.println(a+"x"+b+"= "+(a*b));
        return a*b;
    }

    // 4) Method สำหรับหารเลข
    static int divide(int a, int b){
        System.out.println(a+"/"+b+"= "+(a/b));
        return a/b;
    }

    public static void main(String[] args) {
        // 1) Method สำหรับบวกเลข
        plus(10,10);

        // 2) Method สำหรับลบเลข
        minus(10,11);

        // 3) Method สำหรับคูณเลข
        multiply(2,5);

        // 4) Method สำหรับหารเลข
        divide(20,2);
    }


}