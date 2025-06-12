import java.util.Scanner;

public class Arithmatic1
 {
    public static void main(String[] args) {
        System.out.println(" calultor arithmatic opration");
        Scanner input = new Scanner(System.in);
         System.out.println("Please Enter value of First: ");
         int First = input.nextInt();
         System.out.println("Please Enter value of Second: "); 
         int Second = input.nextInt();
         
         int add = First + Second;
         int sub =First - Second;
         int mul =First * Second;
         int div =First / Second;
         int mod = First % Second;

         System.out.println("addition is: "+add);
         System.out.println("subtracion is: "+sub);
         System.out.println("multion is: "+mul);
         System.out.println("divtion is: "+div);
         System.out.println("modifition is: "+mod);

         System.out.println(" calultor Floating number arithmatic opration");
          System.out.println("Please Enter value of A: ");
          double A = input.nextDouble();
         System.out.println("Please Enter value of B: "); 
         double B = input.nextDouble();

        double Mul = A * B;
     System.out.println("result is " + mul);
    }
    
}
