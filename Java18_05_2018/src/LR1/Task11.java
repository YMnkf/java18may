/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR1;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Task11 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a, b, c;
    a = sc.nextLine();
    b = sc.nextLine();
    c = sc.nextLine();
    String d;
    d = "Квадратное уравнение " + a + "*x*x + " + b + "*x + " + c + " = 0\n" +
        "Его дискриминант вычисляется по формуле: d = " + b + "*" + b + " - 4*" + a + "*" + c;
    System.out.println(d);
            } 
}