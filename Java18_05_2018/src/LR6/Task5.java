/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    String b;
    
    b = sc.nextLine();
    a = sc.nextDouble();
    
    if (a < 0) {
                System.out.println("Значение A должно быть неотрицательным\n");
                return;
    }

    System.out.print("\"");
    int i = 0;
    while (i < (int) a) {
        System.out.print(b);
        i = i+1;
    }
    
    System.out.print("\"\n");
    }
}