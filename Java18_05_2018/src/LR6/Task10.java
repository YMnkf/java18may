/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    
    a = sc.nextDouble();
    b = sc.nextDouble();
    
//    int i = (int) a;
//    
//    while (i <= (int) b) {
//        System.out.println(i);
//        i = i+1;
//    }
//    
//    i = (int) b;
//    
//    while (i >= (int) a) {
//        System.out.println(i);
//        i = i-1;
//    }
    
    
    int i = (int) a;
    while (i <= (int) b) {
        System.out.println(i + " " + (int) (b - i + a));
        i = i+1;
    }
    
    
    }
}