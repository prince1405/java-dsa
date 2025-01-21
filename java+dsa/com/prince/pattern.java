package com.prince;



public class pattern {
    public static void main(String[] args) {
            //int n = 4;
            //int m = 5;
            //FOR SQUARE PATTERN
        //     for(int i = 1; i <= n; i++){
        //         for(int j = 1; j <= m; j++){
        //             System.out.print("*");
        //         }
        //     System.out.println();
                
        //     }
               //FOR BOUNDARY PATTERN
            //    for(int i = 1; i <= n; i++){
            //          for(int j = 1; j <= m; j++){
            //             if(i == 1 || j == 1 || i == n || j == m){
            //              System.out.print("*");
            //              }
            //              else{
            //                 System.out.print(" ");
            //              }
                         

            //          }
            //          System.out.println();
                        
         //}
         //HALF PYRAMID (ASCENDING ORDER)
        //  int n = 5;
        //  for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        //HALF PYRAMID (DESCENDING ORDER)
        // int n = 5;
        // for(int i = n; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //SPACE PYRAMID
        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-1; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //HALF NUMBER PYRAMID
        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //INVERTED HALF NUMBER PYRAMID
        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n-i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //FLOYD'S TRIANGLE
        // int n = 5;
        // int number = 1;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(number);
        //         number++;
        //     }
        //     System.out.println();
        // }

        //0-1 TRIANGLE
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
             }
            System.out.println();
        }

        

         
    }
}
    

