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
public class Task30 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a == 0.0){
        System.out.println("Уравнение y = " + Math.round(a) + "*x^2 + " + Math.round(b) + "*x + " + Math.round(c) + " Не является квадратным\n");
        return;
    } 
        result = Math.pow(b,2) - 4*a*c;
        System.out.printf("%.4f\n", result);
}
}
