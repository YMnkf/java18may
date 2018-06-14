/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double S;
       
    a = sc.nextDouble();
    b = sc.nextDouble();
    
    S = 0;
    for (int i = (int) a; i <= (int) b; i=i+1){
        S=S+i;
        System.out.print(S + " ");
        }
    System.out.print("\n" + S +"\n");
    }
}