package W13;

public class W13_01_introArray{
    public static void main(String[] args) {
        //การประกาศตัวแปลชนิด Array แบบที่ 1 : รู้จำนวนล่วงหน้า
        String[]colors = {"Purple","Cyan","Blue","Green","Yellow","Orange","Red"};
        int[]banks = {20, 50,100,500,1000};
        char[]alphabet = {'A','E','I','O','U'};
        //แสดงผลลัพธ์ดดยใช้ index ของ Array
        System.out.println("The first color is "+ colors[0]);                     
        System.out.println("The Third alphabet is "+alphabet[2]);

        System.out.println("=============================================");
        System.out.print("Colors in the array are : ");                         //แสดงผลโดยใช้ Loop
        for(int i=6;i>=0;i--){
            System.out.print(colors[i]+" , ");
        }
        
        System.out.println("\n=============================================");
        System.out.print("banks in the array are : ");
        for(int i=0;i<banks.length;i++){                                          //ใช้ .length ในการหาขนาดของ Array
            System.out.print(banks[i]+" , ");
        }
    }
}