
package com.prince;
import java.util.*;

public class bitMask {
    public static void main(String[] args) {

        //Get the third bit (pos = 2) of a number n, (n=0101)
        
        // int n = 5;
        // int pos = 2;
        // int bitMask = 1<<pos;

        // if((bitMask & n) == 0){
        //     System.out.println("bitMask is zero");
        // }else{
        //     System.out.println("bitMask is non-zero");
        // }

        //OR bitMask
        //Set the second bit (pos=1) of a number n.(n =0101)

        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        //and with not
        //clear the third bit (pos = 2) of a number n. (n=0101)

        // int n =5;
        // int pos = 2;
        // int bitMask = 1<<pos;
        // int notBitMask = ~(bitMask);

        // int newNumber =  (notBitMask & n);
        // System.out.println(newNumber);


        //Update the second bit (pos = 1) of a number n to 1. (n=0101)
        try(Scanner sc = new Scanner (System.in)){
            int oper = sc.nextInt();

            int n = 5;
            int pos = 1;

            int bitMask = 1<<pos;
            if(oper == 1){
                int newNumber = bitMask | n;
                System.out.println(newNumber);
            }
            else{
                int newBitMask = ~(bitMask);
                int newNumber = newBitMask & n;
                System.out.println(newNumber);
            }
        }
       }
    
}
