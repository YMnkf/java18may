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
public class Task28 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a == 0.0 && b == 0.0){
        System.out.println("Значение r1 должно быть не равно нулю\nЗначение r2 должно быть не равно нулю\n");
        return;
    } else {
            if (a == 0.0){
                System.out.println("Значение r1 должно быть не равно нулю\n");
                return;
            }
            else {
            if (b == 0.0){
                System.out.println("Значение r2 должно быть не равно нулю\n");
                return;
            }
            } 
        result = 1/a + 1/b;
        System.out.printf("%.4f\n", result);
}
}
}
