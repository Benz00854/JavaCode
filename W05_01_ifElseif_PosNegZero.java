import java.util.Scanner;
public class W05_01_ifElseif_PosNegZero {
    public static void main (String [] args){

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = kb.nextInt();

        if(number > 0){
            System.out.println(number+" is positive number.");
        }else if(number < 0){
            System.out.println(number+" is nagative number.");
        }else if(number == 0){
            System.out.println(number+" is zero.");
        }else{
            System.out.println(number+"Inavlid input.");
        }
    } 
}