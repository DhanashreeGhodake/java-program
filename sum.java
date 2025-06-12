import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to calculater ");
        System.out.print(" please enter first numebr: ");
        int firstnum = input.nextInt();
        System.out.print(" please enter second numebr: ");
        int secondnum = input.nextInt();
        int sum = firstnum + secondnum;
        System.out.println("Two number sum is: "+ sum);
    }
}
