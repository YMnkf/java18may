/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task40 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    
    double a;
    double b;
        
    a = sc.nextDouble();
    b = sc.nextDouble();     
   
    if (a<=b) {
            int count = 0;
            for (int i = (int) a; i <= (int) b; i = i+1) {
                                                            if(i%2!=0) {
                                                           count = count + 1;
                                                            }
                                                        };
            for (int i = (int) a; i <= (int) b; i = i+1) {
                                                          if(i%2!=0) {
                                                                System.out.print(i);
                                                                if (i != a + (count)*2-1 && i != a + (count)*2 -2 && i != a + (count)*2) {
                                                                    System.out.print(", ");
                                                                }
                                                          }
                                                        }
    }
    if (a>b) {
                int count = 0;
                for (int i = (int) a; i >= (int) b; i = i-1) {
                                                            if(i%2!=0) {
                                                           count = count + 1;
                                                            }
                                                        };
                for (int i = (int) a; i >= (int) b; i = i-1) {
                                                    if(i%2 != 0) {
                                                            System.out.print(i);
                                                            if (i != a - (count)*2+1 && i != a - (count)*2+2 && i != a - (count)*2) {
                                                                    System.out.print(", ");
                                                                }
                                                        }
                    }
    }
    
System.out.print("\n");
}
}