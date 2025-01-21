package com.prince;

public class recursion {
    // public static void printNumb(int n){
    //         if(n == 0){
    //             return;
    //         }
    //         System.out.println(n);
    //         printNumb(n - 1);
    //     }
    //     public static void main(String[] args) {
    //         int n = 5;
    //         printNumb(n);
    //     }

    //Sum of n numbers
    // public static void printSum(int i, int n, int sum){
    //     if(i == n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    // }
    // public static void main(String[] args) {
    //     printSum(1, 10, 0);
    // }

    //factorial of n numbers

//     public static int calcfactorial(int n){
//           if(n == 1 || n == 0){
//                return 1;
//       }
//       int fact_nm1 = calcfactorial(n-1);
//       int fact_n = n * fact_nm1;
//       return fact_n;
//    }
//    public static void main(String[] args) {
//     int n = 5;
//     int ans = calcfactorial(n);
//     System.out.println(ans);
//    }

//Fibonacci
    // public static void printFib(int a, int b, int n){
    //     if (n == 0){
    //         return;
        
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);

    // }
    // public static void main(String[] args) {
    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFib(a, b, n-2);
    // }

    //print x^n (stack height is n)
        public static int calcPower(int x, int n){
            if(n == 0){
                 return 1;
        }
            if(x == 0){
                 return 0;
        }
            int xpownm1 = calcPower(x, n-1);
            int xpown = x * xpownm1;
            return xpown;
    }
    public static void main(String[] args) {
        int x=2, n=6;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }



    }
    

