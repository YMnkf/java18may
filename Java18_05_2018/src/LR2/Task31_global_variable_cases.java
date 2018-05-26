/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR2;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Task31_global_variable_cases {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a<0 || b<0){
                     if (c<=0) {
                              System.out.println("Масса должна быть неотрицательной\nДистанция должна быть неотрицательной\n");
                              return;
                     } else
                         System.out.println("Масса должна быть неотрицательной\n");
                         return;
    } else {
            if (c<=0){
                     System.out.println("Дистанция должна быть неотрицательной\n");
                     return;   
                          } 
                    }
        result = 9.8067*a*b/Math.pow(c,2);
        System.out.printf("%.4f\n", result);
    }    
    }