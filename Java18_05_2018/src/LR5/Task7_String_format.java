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
public class Task7_String_format {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a <= 0){
                System.out.println("Радиус должен быть положительным\n");
                return;
    }
    if (b <= 0) {
                 System.out.println("Сторона квадрата должна быть положительна\n");
                 return;
    }
    if (Math.PI*Math.pow(a,2) < Math.pow(b,2)){
                System.out.println("Площадь квадрата " + String.format("%.4f",Math.pow(b,2)) + " больше площади круга " + String.format("%.4f",Math.PI*Math.pow(a,2)) + " \n");
    }
    if (Math.PI*Math.pow(a,2) > Math.pow(b,2)){
                System.out.println("Площадь круга " + String.format("%.4f",Math.PI*Math.pow(a,2)) + " больше площади квадрата " + String.format("%.4f",Math.pow(b,2)) + " \n");
    }
    if (Math.PI*Math.pow(a,2) == Math.pow(b,2)){
                System.out.println("Площадь круга " + String.format("%.4f",Math.PI*Math.pow(a,2)) + " равна площади квадрата " + String.format("%.4f",Math.pow(b,2)) + " \n");
    }
}
}
