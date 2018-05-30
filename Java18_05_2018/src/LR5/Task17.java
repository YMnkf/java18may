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
public class Task17 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (b == 0) {
                System.out.println("Значение P должно быть не равно нулю\n");
                return;
    }
    if (a%b == 0) {
                System.out.println(a/b);
    } else {
            System.out.println("M не делится нацело на P");
           }
}
}