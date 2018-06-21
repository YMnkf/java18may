/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task37 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    String c;
    
    c = sc.nextLine();    
    a = sc.nextDouble();
           
    if (a < 0) {
                System.out.println("Значение H должно быть неотрицательно\n");
                return;
    }
        
    if (a == 0) {
                System.out.println("\n");
                return;
    }
       
    for (int j = 0; j < a; j = j+1) {
            int i = 0;
                while (i <= j) {
                System.out.print(c);
                i = i+1;
                }
    System.out.print("\n");
    }
    
     
    System.out.print("\n");
    }
}