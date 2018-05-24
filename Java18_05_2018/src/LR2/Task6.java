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
public class Task6 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result;
    a = sc.nextDouble();
    result = 12*a*a+7*a-16;
    System.out.printf("%.4f\n", result);
            } 
}
