/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task42 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    
    int a;
    int b;
    String c;
    String d;
    
    c = sc.nextLine();
    d = sc.nextLine();    
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
    
    
    int count = 1;
    for (int i = 1; i <= b; i=i+1) {
                        for (int j=1; j <= a; j=j+1) {
                            if (count%2 !=0) {
                               System.out.print(c); 
                            } else {
                               System.out.print(d);  
                            }
                       }
                       System.out.print("\n");
                       count = count+1;
    }
System.out.print("\n");
}
}