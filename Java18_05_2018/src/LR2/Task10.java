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
public class Task10 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    result = Math.sin(Math.toRadians(a)) * Math.cos(Math.toRadians(b)) + Math.cos(Math.toRadians(a)) * Math.sin(Math.toRadians(b));
    System.out.printf("%.4f\n", result);
            } 
}