/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task27 {

    public static void main(String[] args) {
           
    Scanner sc = new Scanner (System.in);
    int a;
    int i;
    a = sc.nextInt();  
    
    if (a <0 || a > 15) {
        System.out.print("Значение Y должно быть в интервале [0, 15]\n");
        return;
    }
    
    for (i = 0; i < 15; i=i+1) {
        if (i < a) {
        System.out.print("#");    
        } else {
            System.out.print(".");
        }
        
    }    
    System.out.print("\n");
    }
}