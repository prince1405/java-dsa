package com.prince;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        //try(Scanner sc = new Scanner(System.in)){
        //     int a = sc.nextInt();
        //     int b = sc.nextInt();
        //     int c = sc.nextInt();

        //     int average = (a+b+c)/3;
        //     System.out.println(average);


        
        // }

        // GREATER:
        //    int a = sc.nextInt();
        //    int b = sc.nextInt();
        
           
        //    if(a > b){
        //     System.out.println("a is greater than b");
        //    }
        //    else{ 
        //         System.out.println("b is greater than a");
            
        //    }

        //  CIRCUMFERENCE:
        //     int r = sc.nextInt();
        

        //    double pi = 3.14;
        //    double circumference = 2*pi;
        //    System.out.println(circumference*r); 
        //    return;
        
           
        //VOTING ELIGIBLE AGE:
        //int age = sc.nextInt();
        
        // if(age >= 18){
        //     System.out.println("Eligible to vote");
        // }
        // else{
        //     System.out.println("Not eligible to vote");
        // }


        //INFINITE LOOP:
        // int n = 1;
        // while ( true){
        //     System.out.println(n);
        //     n++;
        // }


        // int positiveCount = 0;
        // int negativeCount = 0;
        // int zerosCount = 0;
        // String choice;

        // do{
        //     System.out.println("Enter a number: ");
        //     int number = sc.nextInt();

        //     if(number > 0){
        //         positiveCount++;
        //     }
        //     else if(number < 0){
        //         negativeCount++;
        //     }
        //     else{
        //         zerosCount++;
        //     }
        //     System.out.println("Do you want to type any another number: (yes/no)");
        //     choice = sc.next();
        // }while (choice.equalsIgnoreCase("yes"));

        // System.out.println("Positive number: " + positiveCount);
        // System.out.println("negative number: " + negativeCount);
        // System.out.println("zeros: " + zerosCount);

        // sc.close();


        // double x = sc.nextInt();
        // double y = sc.nextInt();
        // double power = Math.pow(x, y);

        // System.out.println(power);

        int a = 56;
        int b = 67;
        System.out.println("The GCD of " + a + " and " + b + " is " + findGCD(a, b));
        }
        
            public static int findGCD(int a, int b){
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
        
        






    }
        
    



        

    
 

