import java.util.Scanner;

public class relationalOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to driving linces poratal");
        System.out.println("please enter your age");
        int age =input.nextInt();

        if (age > 18)
         {
            System.out.println("eligible to driving");  
        }
        else 
        {
            System.out.println("drive cycle");
        }

    }
    
}
