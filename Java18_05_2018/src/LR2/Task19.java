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
public class Task19 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
   if (b>0){
            System.out.println("Значение B должно быть не положительным");
            return;
    }
        result = a*Math.pow(-7*b,0.5);
        System.out.printf("%.4f\n", result);
}
}