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
public class Task26 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (b<0 && a <0){
        System.out.println("Начальная скорость должна быть неотрицательна\nВремя должно быть положительным\n");
        return;
    } else {
            if (b<=0){
                System.out.println("Время должно быть положительным\n");
                return;
            }
            else {
            if (a<0){
                System.out.println("Начальная скорость должна быть неотрицательна\n");
                return;
            }
            } 
        result = a * b + c * Math.pow(b, 2)/2;
        System.out.printf("%.4f\n", result);
}
}
}
