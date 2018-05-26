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
public class Task33 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double d;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    d = sc.nextDouble();
    if (a==0.0){
             if (d==0.0) {
                          System.out.println("Значение a должно быть не равно нулю\nЗначение d должно быть не равно нулю\n");
                              return;
             } else
                         System.out.println("Значение a должно быть не равно нулю\n");
                         return;
    } else {
            if (d==0.0){
                     System.out.println("Значение d должно быть не равно нулю\n");
                     return;   
                        } 
            }
        result = (a*d+b*c)/(a*d);
        System.out.printf("%.4f\n", result);
    }    
    }