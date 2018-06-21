/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task31 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
         
    a = sc.nextDouble();
        
    if (a <= 0) {
             System.out.print("Значение X должно быть положительным\n");
             return;
    }
    
    int count = 0;
    for (int i = 1; i <= a; i=i+1){
                    if (a%i == 0) {
                    count = count + 1;
                    }
        }
    if (count == 2) {
        System.out.print("Число простое\n");
    } else {
        System.out.print("Число составное\n");
    }
    System.out.print("\n");
    }
    }