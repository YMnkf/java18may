/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double S;
    int count;
        
    S=0;
    count = 0;
    
    do {
        a = sc.nextDouble();
        S=S+a;
        count = count + 1;
    } while (S <= 1000);
    System.out.print("Количество чисел:" + count + "\n");
    }
    }