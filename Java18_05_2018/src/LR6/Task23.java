/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task23 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    int a;
    a = sc.nextInt();  
    
    if (a < 0){
                System.out.println("Значение N должно быть неотрицательным\n");
                return;
    }
    
    for (int i = 0; i <= a; i=i+1){
                System.out.print(i + "-" + i%4 + "\n");
        } 
    }
    }
