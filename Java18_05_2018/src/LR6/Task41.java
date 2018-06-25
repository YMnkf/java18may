/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task41 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    
    double a;
    double b;
        
    a = sc.nextDouble();
    b = sc.nextDouble();     

    int count = Math.abs((int)b-(int)a)+1;
    
    if (a<=b) {
               for (int i = (int) a; i <= (int) b; i = i+1) {
                                                            System.out.print(i);
                                                            if (count%2 !=0 && i != b) {
                                                                        if (i <= a+count/2-1) {
                                                                                            System.out.print(" < ");
                                                                        } else {
                                                                                System.out.print(" % ");
                                                                          }
                                                            }
                                                              
                                                            if (count%2 == 0 && i != b) {
                                                                if (i <= a+count/2-2) {
                                                                                    System.out.print(" < ");
                                                                } else {
                                                                        System.out.print(" % ");
                                                                 }
                                                            }
                                                                
               }
    }
     if (a>b) {
               for (int i = (int) b; i <= (int) a; i = i+1) {
                                                            System.out.print(i);
                                                            if (count%2 !=0 && i != a) {
                                                                        if (i <= b+count/2-1) {
                                                                                            System.out.print(" < ");
                                                                        } else {
                                                                                System.out.print(" % ");
                                                                          }
                                                            }
                                                              
                                                            if (count%2 == 0 && i != a) {
                                                                if (i <= b+count/2-2) {
                                                                                    System.out.print(" < ");
                                                                } else {
                                                                        System.out.print(" % ");
                                                                 }
                                                            }
                                                                
               }
    }
System.out.print("\n");
}
}