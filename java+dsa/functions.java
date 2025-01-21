import java.util.*;


public class functions {
  //  public static int calculateProduct(int a, int b){
    //     int product = a * b;
    //     return product;
    // }

    //  public static void main(String[] args) {
    //      Scanner sc = new Scanner(System.in);
    //      int a = sc.nextInt();
    //      int b = sc.nextInt();

    //      int product = calculateProduct(a,b );
    //      System.out.println("Sum of 2 numbers is : " + product);
        

    //}
    public static void calculateFactorial(int n){
        if(n < 0){
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;
        for(int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);

        
    }


    
}
