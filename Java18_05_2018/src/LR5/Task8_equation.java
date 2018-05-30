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
public class Task8_equation {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a == 0){
                System.out.println("Данное уравнение не является квадратным\n");
                return;
    }
    if (Math.pow(b,2)-4*a*c < 0) {
                 System.out.println("Вещественных корней уравнения " + Math.round(a) + "*x^2 + " + Math.round(b) + "*x + " + Math.round(c) + " нет\n");
    }
    if (Math.pow(b,2)-4*a*c == 0){
                System.out.println("Уравнение " + Math.round(a) + "*x^2 + " + Math.round(b) + "*x + " + Math.round(c) + " имеет один корень\n");
    }
    if (Math.pow(b,2)-4*a*c > 0){
                System.out.println("У уравнения " + Math.round(a) + "*x^2 + " + Math.round(b) + "*x + " + Math.round(c) + " два вещественных корня\n");
    }
}
}
