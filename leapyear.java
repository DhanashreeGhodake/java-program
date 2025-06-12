import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("enter the year");
       int year =input.nextInt();

       if(year%400==0 ||( year%4==0 && year%100!=0))
       {
        System.out.println(year+" year is leap ");
       }
       //use this comment part and ceprete condition can use 
    //    else if(year%100==0)
    //    {
    //     System.out.println(year+" year is not leap");
    //    }
    //    else if (year%4==0 && year%100!=0) 
    //    {
    //     System.out.println(year+" year is leap ");
    //    }
       else
       {
        System.out.println(year+" year is not leap");
       }
    }
}
