/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task33 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
 
    a = sc.nextDouble();
    
    
    if (a < 0 || a > 20) {
                System.out.println("Значение W должно быть в интервале [0, 20]\n");
                return;
    }
   
    int[] Arr = new int[] {0,1,2,3,4,5,6,7,8,9};

    
    for (int j = 0; j < Arr.length; j = j+1) {
        int i = 0;
        while (i < (int) a) {
            System.out.print(Arr[j]);
            i = i+1;
            }
        System.out.print("\n");
    }
       
    System.out.print("\n");
    }
}
