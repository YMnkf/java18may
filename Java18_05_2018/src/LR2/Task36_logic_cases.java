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
public class Task36_logic_cases {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result;
    a = sc.nextDouble();
    if (a < 0 || a+5 < 0 || a-5 < 0){
                    if (a == 0.0){
                                System.out.println("Подкоренное выражение должно быть неотрицательным\nЗнаменатель не может быть равен нулю\n");
                                return;    
                    } else
                        System.out.println("Подкоренное выражение должно быть неотрицательным\n");
                        return;
    } else
            if (a == 0.0){
                     System.out.println("Знаменатель не может быть равен нулю\n");
                     return;   
    } 
        result = (Math.pow((a+5),0.5) + Math.pow((a-5),0.5))/(2*Math.pow(a,0.5));
        System.out.printf("%.6f\n", result);
    }    
    }