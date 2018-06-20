/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
           
    Scanner sc = new Scanner (System.in);
    int a;
    int i;
    a = sc.nextInt();  
    
    i=1;
    while (i <= a) {
        if (i%5 == 0) {
        System.out.print("! ");
        i = i+1;    
        } else {
            System.out.print("!");
            i = i+1;
            }
        
    }
    System.out.print("\n");
    }
}