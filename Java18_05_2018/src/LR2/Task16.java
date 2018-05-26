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
public class Task16 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result;
    a = sc.nextDouble();
   if (a<=0){
        System.out.println("Значение radius должно быть положительным");
        return;
    }
        result = 4 * Math.PI * Math.pow(a,3)/ 3;
        System.out.printf("%.4f\n", result);
}
}