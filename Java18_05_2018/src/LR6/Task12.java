/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double S;
       
    a = sc.nextDouble();
    //b = sc.nextDouble();
    
    if (a < -100) {
                    System.out.print("Значение A должно быть в интервале [-100, 500]\n");
                    return;
                }
    if (a > 500) {
                    System.out.print("Значение A должно быть в интервале [-100, 500]\n");
                    return;
                }             
    S = 0;
    for (int i = (int) a; i <= 500; i=i+1){
            S=S+i;
    }
    System.out.print("\n" + S +"\n");
    }
}