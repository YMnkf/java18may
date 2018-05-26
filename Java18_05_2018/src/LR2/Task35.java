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
public class Task35 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double x;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    x = sc.nextDouble();
    if (a*Math.pow(x,2)+b*x+c < 0){
                                System.out.println("Подкоренное выражение должно быть неотрицательным\n");
                                return;
    }
    if (a*Math.pow(x,2)+b*x+c == 0.0){
                     System.out.println("Знаменатель не может быть равен нулю\n");
                     return;   
    } 
        result = 1/Math.pow((a*Math.pow(x,2)+b*x+c),0.5);
        System.out.printf("%.4f\n", result);
    }    
    }