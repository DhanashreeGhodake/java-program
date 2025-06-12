import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("cheak the number is even or odd: ");
        System.out.print("enter the number: ");
        int number= input.nextInt();

        if(number%2 == 0)
        {
            System.out.println("number is even");
        
        }
        else{
            System.out.println("number is odd");
        }
    }
}
