public class function {
    public static void main(String[] args) {
        System.out.println("welcome to method calling");
        greetUser();//first method call
        welcome();//second method call
        pattern();//third method call
        System.out.println("method calling is completed");
    }
    //method first
    public static void greetUser() {
        System.out.println("good morning java");
    }
    //method second
    public static void welcome(){
        System.out.println("Welcome to java coding");
    }
    //method third
    public static void pattern(){
        int row = 0;
        while (row < 5) {
            System.out.print("*");
            int i = 0;
             while (i < row) {
                System.out.print(" *");
                i++;
             }
             System.out.println();
            row++;
        }
        
    }
}
