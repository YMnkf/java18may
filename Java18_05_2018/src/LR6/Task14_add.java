/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task14_add {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    int start, end;
       
    a = sc.nextDouble();
    b = sc.nextDouble();
    
    if (a <= b) {
            start = (int) a;
            end = (int) b;
    } else {
            start = (int) b;
            end = (int) a;
                    }
    int S = 0;
    for (int i = start; i <= end; i=i+1){
                    S=S+i;
                    System.out.print(S + " ");
                    }
                    System.out.print("\n" + S +"\n");
    }
    }
    