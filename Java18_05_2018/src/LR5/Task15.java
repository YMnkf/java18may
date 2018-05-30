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
public class Task15 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a <= 0 && b <=0 && c <=0) {
                System.out.println("Значение A должно быть неотрицательным\nЗначение B должно быть неотрицательным\nЗначение C должно быть неотрицательным\n");
                return;
    } 
    if (a <= 0 && b <=0 && c >0) {
                        System.out.println("Значение A должно быть неотрицательным\nЗначение B должно быть неотрицательным\n");
                        return;
    } 
    if (a <= 0 && b > 0 && c >0) {
                        System.out.println("Значение A должно быть неотрицательным\n");
                        return;
    }
    if (a <= 0 && b > 0 && c <= 0) {
                        System.out.println("Значение A должно быть неотрицательным\nЗначение C должно быть неотрицательным\n");
                        return;
    }
    if (a > 0 && b <=0 && c <=0) {
                        System.out.println("Значение B должно быть неотрицательным\nЗначение C должно быть неотрицательным\n");
                        return;
    }
    if (a > 0 && b <=0 && c >0) {
                        System.out.println("Значение B должно быть неотрицательным\n");
                        return;
    }
    if (a > 0 && b >0 && c <=0) {
                        System.out.println("Значение C должно быть неотрицательным\n");
                        return;
    }
    if ((a == b) && (a == c) && (b == c)){
        System.out.println("Треугольник является равносторонним");
    } else {
            if ((a == b) || (a == c) || (b == c)){
                System.out.println("Треугольник является равнобедренным");
            } else {
                    System.out.println("Треугольник не является равнобедренным");
                    }
    } 
    }
}