package com.prince;

import java.util.*;
public class loop {
     public static void main(String[] args) {
    //     for(int i = 0; i < 5; i = i + 1){
    //         System.out.println("Hello World");
    //     }
    //    for(int i = 0; i < 11; i++){
    //     System.out.println(i+" ");
    // } 
        try(Scanner sc = new Scanner (System.in)){
            int n = sc.nextInt();

            int product = 1;
            for(int i = 1; i <= n; i++){
                product = product * i;
            }
            System.out.println(product);

        }
}
}
