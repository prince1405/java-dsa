package com.prince;

import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.nextLine();
            //nextInt
            //nextFloat.....etc
            System.out.println(name);

            try(Scanner pc = new Scanner (System.in)){
                int a = pc.nextInt();
                int b = pc.nextInt();
                int sum = a + b;
                System.out.println(sum);

            }

        }
    }
    
}
