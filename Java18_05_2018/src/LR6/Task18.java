/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task18 {

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
    } while (a != 0);
    System.out.print("Сумма чисел: " + S +", Количество чисел:" + count + "\n");
    }
    }