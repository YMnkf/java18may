/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double S;
       
    a = sc.nextDouble();
    //b = sc.nextDouble();
    
    if (a < -10) {
                    System.out.print("Значение B должно быть в интервале [-10, 10000]\n");
                    return;
                }
    if (a > 10000) {
                    System.out.print("Значение B должно быть в интервале [-10, 10000]\n");
                    return;
                }             
    S = 0;
    for (int i = -10; i <= (int) a; i=i+1){
            S=S+i;
    }
    System.out.print("\n" + S +"\n");
    }
}