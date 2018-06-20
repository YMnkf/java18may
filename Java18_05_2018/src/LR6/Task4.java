/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    
    a = sc.nextDouble();
    b = sc.nextDouble();
    
    if (a > b) {
                System.out.println("Значение A должно быть не больше значения B\n");
                return;
    }

    for (int i = (int) b; i >= (int) a; i=i-1){
        System.out.print(i + "\n");
        }
    }
}
   