package com.prince;

import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        //System.out.println(sb);

        //to know the charactewr at the particular index
        
        //System.out.println(sb.charAt(0));

        //to change the character at the particular index\

        // sb.setCharAt(0, 'r');
        // System.out.println(sb);

        //to add the character at the particular index

        // sb.insert(6, 's' );
        // sb.insert(7, 's');
        // System.out.println(sb);

        //to delete the character at the particular index
    //     sb.delete(6, 7);
    //     System.out.println(sb);

        //to reverse the given character:
        for(int i =0; i <= sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
     }
    
}
