import java.util.Scanner;

public class fahrenhite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("convert fahrenhite to celsius: ");
        System.out.println("Give the Fahrenhint: ");
        float F=input.nextFloat();

        float C=(F-32)*5/9;
        System.out.println("Tempture is celsius: "+ C + "c");
    }
}
