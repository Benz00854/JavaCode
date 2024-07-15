import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber {
    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter number : ");

        int number = kb.nextInt();
        int  result = number%2;

        //Case 1 : result == 0 (กรณีที่ if เป็นเลข คู่ และ else เป็นเลข คี่)
        //Case 3 : result < 1
        //Case 3 : result != 1 (กรณีที่ if เป็นเลข คี่ และ else เป็นเลข คู่)
        
        if(result != 0){
            System.out.println(number+" ia an Odd number");
        }else{
            System.out.println(number+" is an Even number");
        }
    }
}