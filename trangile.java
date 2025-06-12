import java.util.Scanner;

public class trangile 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("area of trangle: ");
        System.out.println("  enter base of trangle: ");
        double base= input.nextDouble();
        System.out.println(" enter hight of Trangle: ");
        double hight = input.nextDouble();

        // double area = 0.5*base*hight;
        double area = (base*hight)/2;
        System.out.println("area of trangle is: "+ area + "cms");
    }
    
}
