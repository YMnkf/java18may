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
public class Task20 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (b<=0){
        System.out.printf("Значение y должно быть неотрицательным");
        return;
    }
    if ((a + Math.sqrt(b)) <0) {
        System.out.printf("Подкоренное выражение должно быть неотрицательным");
        return;
    }
    result = -5*Math.sqrt(a + Math.sqrt(b));
    System.out.printf("%.4f\n", result);
            } 
}
