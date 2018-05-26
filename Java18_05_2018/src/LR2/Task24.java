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
public class Task24 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result;
    a = sc.nextDouble();
    if (a<=-273.15){
        System.out.printf("Температура должна быть выше абсолютного нуля\n");
        return;
    }
    result = 1.8*a+32;
    System.out.printf("%.4f\n", result);
    } 
}
