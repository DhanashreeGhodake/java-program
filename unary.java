public class unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        int z = -y;
        System.out.println(y);
        System.out.println(z);
         
        System.out.println("increment opratoer ");
        int a =5;
         a = a + 1;
         System.out.println(a);
        a += 1;
        System.out.println(a);
        a++;
        System.out.println(a);

        System.out.println("decrement opratoer ");
        int p = 6;
          p = p -1;
          System.out.println(p);
          p -= 1;
          System.out.println(p);
          p--;
         System.out.println(p--);
          --p;
         System.out.println(--p);

         System.out.println("decrement");
         int q=4;
         System.out.println(q--);
         System.out.println(--q);

    } 
}
