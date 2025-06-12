import java.util.Scanner;

public class perimeter {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to perimeter calculator: ");
        System.out.println("please Enter 4 side of  rectangle cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d= input.nextDouble();

       double perimeter= a+b+c+d;
        System.out.println("rectangle perimeter is: "+perimeter + "cms");
    }
}
