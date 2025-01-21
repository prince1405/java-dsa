package com.prince;
import java.util.*;
public class Conditional {
     public static void main(String[] args) {
    //     try(Scanner sc = new Scanner(System.in)){
    //         int age = sc.nextInt();

    //         if(age > 18){
    //             System.out.println("adult");
    //         }
    //         else{
    //             System.out.println("Not A dult");
    //         } 
    //     }
        // try(Scanner pc = new Scanner(System.in)){
        //     int a = pc.nextInt();
        //     int b = pc.nextInt();

        //     if(a == b){
        //         System.out.println("both are equal");
        //     }
        //     else if(a > b){
        //         System.out.println("a is greater than b");
        //     }
        //     else{
        //         System.out.println("b is greater than a");
        //     }

        // }
        try(Scanner pc = new Scanner(System.in)){
            int button = pc.nextInt();
            switch(button){
                case 1: System.out.println("hello");
                break;
                case 2: System.out.println("namaste");
                break;
                case 3: System.out.println("Bonjour");
                break;
                default : System.out.println("invalid");
            }

        }
    }
}
    

