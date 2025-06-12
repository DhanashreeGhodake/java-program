

public class practicIf 
{
    public static void main(String[] args) 
    {
        // if(20 > 18)
        // {
        //      System.out.println("20 is gretaer than 18");
        // }
        boolean isSeniorCituzen = true;
        boolean isAnAdult = true;

        if(isSeniorCituzen)
        {
            System.out.println("hello SeniorCituzen ");
        }
        else{
            if(isAnAdult)
            {
                System.out.println("hello Adult");
            }
            else{
                System.out.println("hello child");
            }
        }
    }
    
}
