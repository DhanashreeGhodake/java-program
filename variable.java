public class variable
 {
        String name = "John";
        int myNum = 15;
        int a=10;
        //a = 15;
        int b = 15;
        //b = 20;                     // b is now 20
        final int c = 15;
       // c = 20;                    // will generate an error: cannot assign a value to a final variable
       boolean myBool = true;
    public static void main(String[] args)
     {
        int b = 15;
        b = 20;    
        variable v=new variable();
        System.out.println(v.name); 
        System.out.println(v.myNum);
        System.out.println(v.a);
        System.out.println(v.b);
        System.out.println(v.c);
        System.out.println(v.myBool);

        
    }
    
}
