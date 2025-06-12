import java.util.Scanner;

public class categariofAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age=input.nextInt();

        if(age>=60)
        {
            System.out.println("you are a senior citizen");
        }
        else if(age >= 20)
        {
            System.out.println("you are an adult");
        }
        else if(age >= 13)
        {
            System.out.println("you are an Teen");
        }
        else 
        {
            System.out.println("you are a child");
        }
        
    }
}
