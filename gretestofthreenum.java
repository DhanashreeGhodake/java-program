import java.util.Scanner;

public class gretestofthreenum {
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("Cheak the gretest number of given three value: ");
        System.out.print(" enter first number: ");
        int number1 = input.nextInt();
         System.out.print(" enter second number: ");
        int number2 = input.nextInt();
         System.out.print(" enter third number: ");
        int number3 = input.nextInt();

        if(number1 >= number2 && number1 >= number3)
        {
            System.out.println(number1+" number1 gretest number ");
        }
        else if(number2 >= number1 && number2 >= number3)
        {
            System.out.println( number2+" number2 is gretest number ");
        }
        else{
            System.out.println(number3+" number3 is gretest ");
        }
    }
}
