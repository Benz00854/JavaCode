package W15;
public class W15_04_method_findMaxMin {
    
    // 1) Method สำหรับหาค่ามากที่สุด
    static int findMax(int a, int b){// return (a > b) ? a : b;
        if(a > b){
            System.out.println(a+" is more than "+b);
            return a;
        }else{
            System.out.println(b+" is more than "+a);
            return b;
        }
    }

    // 2) Method สำหรับหาค่าน้อยที่สุด
    static int findMin(int a, int b){
        if(a < b){
            System.out.println(a+" is less than "+b);
            return a;
        }else{
            System.out.println(b+" is less than "+a);
            return b;
        }
    }
    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
    static int findMax(int a, int b, int c){
        int max = a;
        if(b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        return max;
    }

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
    static int findMin(int [] numbers){
        displayArray(numbers);
        int min = numbers[0];
        for(int i = 1; i < numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        return min;
    }

    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
    static void displayArray(int [] numbers){
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        
    }



    public static void main(String[] args) {
    
        // 1) Method สำหรับหาค่ามากที่สุด
        findMax(10,20);

        // 2) Method สำหรับหาค่าน้อยที่สุด
        findMin(10,20);

        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
        System.out.println(findMax(10,20,30)+" is the most");

        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // displayArray(numbers);

        System.out.println("\nMin number in Array is : "+findMin(numbers));
        

    }
}

// method ที่มีชื่อเดียวกัน แต่มีพารามิเตอร์ต่างกันได้ เรียกว่า Method Overloading
// การเรียกใช้ method ที่มีชื่อเดียวกัน จะขึ้นอยู่กับพารามิเตอร์ที่ส่งเข้าไป
// ถ้ามี method ที่มีชื่อเดียวกัน และมีพารามิเตอร์ต่างกัน จะต้องมีการส่งพารามิเตอร์ตามที่ method ต้องการ