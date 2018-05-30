/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR5;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Task16_max {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a == b && b == c) {
                System.out.println(a);
    }            
    if (a <= b && b <= c) {
                        System.out.println(c);
    } 
    if (a <= b && c <= b) {
                        System.out.println(b);
    }
    if (b <= a && c <= a) {
                        System.out.println(a);
    }
}
}