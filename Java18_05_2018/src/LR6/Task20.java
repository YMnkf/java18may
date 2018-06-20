/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    //double S;
    int count1;
    int count2;
        
    //S=0;
    count1 = 0;
    count2 = 0;
    
    do {
        a = sc.nextDouble();
        //S=S+a;
        if (a<=83) {
            count1 = count1 + 1;
        }
        if (a>=199) {
            count2 = count2 + 1;
        }
    } while (a <= 83 || a >= 199);
    System.out.print("Количество чисел слева: " + count1 + ", количество чисел справа: " + count2 + "\n");
    }
    }