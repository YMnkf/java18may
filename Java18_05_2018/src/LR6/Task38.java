/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task38 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    int start, end;
    
    a = sc.nextDouble();
    b = sc.nextDouble();
           
    if (a <= b) {
            start = (int) a;
            end = (int) b;
    } else {
            start = (int) b;
            end = (int) a;
            }
            
    if (a == 0) {
                System.out.println("\n");
                return;
    }
    
    
    int count = 0;
               for (int j = start; j <= end; j = j+1) {
                        if (j%2 != 0) {
                                for (int i = 0; i <= count; i = i+1) {
                                //int i = 0;
                                //while (i <= j) {
                                System.out.print(".");
                                //i = i+1;
                                }
                            System.out.print(j+"\n");
                            count = count + 1;
                            } else {
                                    System.out.print("");
                                    }
                            
      
    }
    }
}

   
    
   