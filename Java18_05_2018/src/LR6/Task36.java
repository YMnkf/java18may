/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task36 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    
    a = sc.nextDouble();
    b = sc.nextDouble();
        
    if (a < 0) {
                System.out.println("Значение W должно быть неотрицательно\n");
                return;
    }
    
    if (b < 0) {
                System.out.println("Значение H должно быть неотрицательно\n");
                return;
    }
        
    if (a == 0 || b == 0) {
                System.out.println("\n");
                return;
    }
    
    System.out.print(" ");
    
    for (int i = 0; i < a; i = i+1) {
        System.out.print(i);
    }
    
    System.out.print(" \n");
    
    for (int j = 0; j < b; j = j+1) {
        System.out.print(j);
            int i = 0;
                while (i < (int) a) {
                System.out.print(".");
                i = i+1;
                }
    System.out.print("|\n");
    }
    
    System.out.print(" ");
    
    for (int i = 0; i < a; i = i+1) {
        System.out.print("_");
    }
    
    System.out.print(" ");
      
    System.out.print(" \n");
    }
}
