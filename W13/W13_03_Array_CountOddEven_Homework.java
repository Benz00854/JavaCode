package W13;

public class W13_03_Array_CountOddEven_Homework {

    public static void main(String[] args) { //ให้นับจำนวนเลขคู่เเละเลขคี่ใน array ด่านล่าง

        int[] number = {1, 5, 6, 64, 5, 65, 64, 67, 8, 54, 64, 48, 2, 3, 8, 9, 7};

        int countOdd = 0;
        int countEven = 0;
        System.out.println();
        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 == 0) {
                System.out.println(number[i] + "-"+"Even number");
                countEven++;
            } else {
                System.out.println(number[i] +"-" + "Odd number");
                countOdd++;
            }
        }
        System.out.print("\nAmount of all Number : " + number.length);
        System.out.print("\nAmount of Odd Number : " + countOdd);
        System.out.print("\nAmount of Even Number : " + countEven);
        System.out.println();

    }
}