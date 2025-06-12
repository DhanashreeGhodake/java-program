import java.util.Scanner;

public class simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to simple intrest calculator: ");
        System.out.println("Enter the principle amount in rs: ");
        int P = input.nextInt();
        System.out.println("Enter the time in year: ");
        double T= input.nextDouble();
        System.out.println("Enter the Rate: " );
        double R= input.nextDouble();
        
        double SI =(P+T+R)/100;
        System.out.println("simple Interest is: "+SI +"rs\n\n\n");
       
        
       // System.out.println("welcome to compound intrest calculator: ");
        
        System.out.println("Enter the principle amount in rs: ");
        int principle = input.nextInt();
        System.out.println("Enter the time in year: ");
        double year= input.nextDouble();
        System.out.println("Enter the Rate: " );
        double Rate = input.nextDouble();
        
         double CompInte =principle*Math.pow((1 + Rate/100),year);
        System.out.println("Compound Interest is: "+CompInte +"rs\n");
       

    }
}
