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
public class Task18_compare {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    a = sc.nextDouble();
    if (1000 > a || a > 9999) {
                System.out.println("Значение A должно быть в интервале [1000, 9999]\n");
                return;
    }
    if (a%10 != Math.floor((a%1000)/100)) {
                System.out.println("Не равно\n");
    } else {
            System.out.println("Равно\n");
           }
}
}