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
public class Task29_global_var {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a <= 0){
        System.out.println("Масса должна быть положительной\n");
        return;
    } 
        result = a * 9.8067 * Math.cos(Math.toRadians(b));
        System.out.printf("%.6f\n", result);
}
}
