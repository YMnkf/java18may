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
public class Task13 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if ((a == b) || (a == c) || (b == c)){
        System.out.println("Среди чисел есть равные");
   } else {
        System.out.println("Числа не равны друг другу");
          }
    }   
}
