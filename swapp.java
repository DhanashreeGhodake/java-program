import java.util.Scanner;

public class swapp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" welcome to Sawapping \n");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print( "Enter value of B: ");
        int b = input.nextInt();
         
        int c = a;
        a = b;
        b = c;
         System.out.println("Sawpping done: ");
         System.out.println("value of A: "+ a);
         System.out.println("value od B: "+ b);
    }
}
