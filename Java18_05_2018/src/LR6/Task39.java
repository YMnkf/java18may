/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task39 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    
    int a;
    int b;
        
    a = sc.nextInt();
    b = sc.nextInt();     
   
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
    
    
    for (int count = 1; count <= b; count = count + 1) {
        if (a>=b) {
            for (int i = 1; i <= a+1-count; i = i+1) {
                System.out.print("+");
            }
            for (int i = a-count+2; i <= a; i = i+1) {
                System.out.print("#");
            }
        } else {
            for (int i = 1; i <= a-count+1; i = i+1) {
                System.out.print("+");
            }
            for (int i = Math.max(a-count+2,1); i <= a; i = i+1) {
                System.out.print("#");
            }
        }
    System.out.print("\n");
    }
 
System.out.print("\n");
}
}