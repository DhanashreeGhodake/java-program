
import java.util.Scanner;

public class oddevenbitwise 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to find odd even number: ");
        System.out.print("Please Enter the number:  ");
        int num = input.nextInt();

         if((num & 1) == 1)
         { 
            System.out.println("your number is odd");
         }       
         else
         {
            System.out.println("your number is even ");
         }
         }
         
}
