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
public class Task40 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double d;
    double result_volume;
    double result_tempr;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    d = sc.nextDouble();
    if (a < 0 || c < 0){
                          System.out.println("Объем должен быть неотрицательным\n");
                          return;    
    }
        result_volume = a+c;
        result_tempr = (a*b+c*d)/(a+c);
        System.out.printf("%.0f\n%.4f\n", result_volume, result_tempr);
    }    
    }