/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR6;

import java.util.Scanner;

public class Task28 {

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
    int count = 0;
    for (int i = start; i <= end; i=i+1){
                    if (i%13 == 0) {
                    count=count+1;
                    }
        }
    System.out.print("\n" + count +"\n");
    }
    }
    