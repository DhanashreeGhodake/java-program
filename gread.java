import java.util.Scanner;

public class gread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the parcentage: ");
        float parcentage =input.nextFloat();

        if (parcentage >=90) {
            System.out.println("you got A gread ");
        }
        else if (parcentage >=75) {
            System.out.println("you got B gread ");
        }
        else if(parcentage >=60)
        {
            System.out.println("you got C gread ");
        }
        else if (parcentage>=30)
        {
            System.out.println("you got D gread ");
        }
        else
        {
            System.out.println("you are fail  your gread is F");
        }
    }
}
