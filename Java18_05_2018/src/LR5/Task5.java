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
public class Task5 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a <= 0 && b <= 0){
                System.out.println("Расстояние между деревнями должно быть положительно\nДлина кабеля должна быть положительна\n");
                return;
    }
    if (a <= 0){
                System.out.println("Расстояние между деревнями должно быть положительно\n");
                return;
    }
    if (b <= 0){
                System.out.println("Длина кабеля должна быть положительна\n");
                return;
    }
    if (1000*a-0.305*b < 0){
                  System.out.println("Кабеля хватит. Расстояние меньше длины кабеля\n");
    } 
    if (1000*a-0.305*b == 0){
                  System.out.println("Кабеля хватит. Расстояние равно длине кабеля\n");
    }   
    if (1000*a-0.305*b > 0){
                  System.out.println("Кабеля не хватит. Длина кабеля меньше расстояния\n");
    }
}
}