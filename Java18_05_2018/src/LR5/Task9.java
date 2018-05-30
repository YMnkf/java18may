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
public class Task9 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a <= 0){
                System.out.println("Площадь круга должна быть положительной\n");
                return;
    }
    if (b <= 0){
                System.out.println("Площадь квадрата должна быть положительной\n");
                return;
    }
    if (2*Math.pow(a/Math.PI,0.5)> Math.pow(b,0.5)) {
                 System.out.println("Круг не поместится в квадрате");
    }
    if (2*Math.pow(a/Math.PI,0.5)<= Math.pow(b,0.5)){
                System.out.println("Круг уместится в квадрате\n");
    }
}
}