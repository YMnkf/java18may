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
public class Task6 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a < 0 && b < 0){
                System.out.println("Скорость корабля должна быть неотрицательна\nСкорость кометы должна быть неотрицательна\n");
                return;
    }
    if (a < 0){
                System.out.println("Скорость корабля должна быть неотрицательна\n");
                return;
    }
    if (b < 0){
                System.out.println("Скорость кометы должна быть неотрицательна\n");
                return;
    }
    if (a-3.6*b > 0) {
                     System.out.println("Корабль догонит комету. Скорость кометы " + b + " м/с меньше скорости корабля " + a + " км/ч\n");
    }
    if (a-3.6*b < 0) {
                     System.out.println("Комета улетит от корабля. Скорость корабля " + a + " км/ч меньше скорости кометы " + b + " м/с\n");
    }
    if (a-3.6*b == 0) {
                      System.out.println("Комета и корабль имеют одинаковые скорости");
    }
}
}