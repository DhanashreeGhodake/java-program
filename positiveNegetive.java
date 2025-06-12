import java.util.Scanner;

public class positiveNegetive {
   
    public static void main(String[] args)
     {
        Scanner input = new Scanner(System.in);
        System.out.println("find number is positive ,negetive or zero:");
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if(number > 0)
        {
            System.out.println("number is positive");
        }
        else if(number < 0)
        {
            System.out.println("number is negetive");
        }
        else {
            System.out.println("number is zero ");
        }
     }
}
