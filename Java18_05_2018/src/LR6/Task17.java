/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double S;
       
    a = sc.nextDouble();
        
    if (a <= 0) {
        System.out.print("Значение N должно быть положительным\n");
    }
    
    S = 0;
    for (int i = 1; i <= (int) a; i=i+1){
        S=S+Math.pow(i, -1);
       }
    System.out.printf("%.4f\n", S);
    }
}