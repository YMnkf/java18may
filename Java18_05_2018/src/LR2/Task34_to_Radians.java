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
public class Task34_to_Radians {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result;
    a = sc.nextDouble();
        result = Math.pow((1-Math.pow(Math.sin(Math.toRadians(a)),2)),0.5);
        System.out.printf("%.4f\n", result);
}
}