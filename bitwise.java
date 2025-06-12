import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter  Second number: ");
        int num2 = input.nextInt();

        int result = num1 & num2;
        System.out.println("result is: "+result);
         int result1 = num1 | num2;
         System.out.println("result is: "+result1);
         int result2 = num1 ^ num2;
         System.out.println("result is: "+result2);
         int result3 =  ~ num2;
         System.out.println("result is: "+result3);
         int result4 = num1 << 1 ;
         System.out.println("result is: "+result4);
         int result5 = num1 >> 1;
         System.out.println("result is: "+result5);
    }
}
