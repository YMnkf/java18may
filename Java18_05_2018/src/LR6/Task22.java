/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task22 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    int a;
    a = sc.nextInt();  
    
    //if (a < 10){
    //            System.out.println("Значение A должно находиться в интервале [10,20]\n");
    //            return;
    //}
    //if (a > 20){
    //            System.out.println("Значение A должно находиться в интервале [10,20]\n");
    //            return;
    //}
    for (int i = 10; i <= 20; i=i+1){
                if (i == (int) a) {
                System.out.print(i + "+\n");    
                } else {
                    System.out.print(i + "\n");
                }
                
        } 
    }
    }
