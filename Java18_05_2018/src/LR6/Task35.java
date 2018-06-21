/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task35 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
        
    a = sc.nextDouble();
        
    if (a < 0) {
                System.out.println("Значение W должно быть неотрицательно\n");
                return;
    }
        
    if (a == 0 ) {
                System.out.println("\n");
                return;
    }
    
    System.out.print("+");
    int i = 0;
            while (i < (int) a-2) {
            System.out.print("-");
            i = i+1;
            }
    System.out.print("+\n");
    
    System.out.print("|");
    i = 0;
            while (i < (int) a-2) {
            System.out.print(".");
            i = i+1;
            }
    System.out.print("|\n");
    
    System.out.print("+");
    i = 0;
            while (i < (int) a-2) {
            System.out.print("-");
            i = i+1;
            }
    System.out.print("+\n");
      
    System.out.print("\n");
    }
}
