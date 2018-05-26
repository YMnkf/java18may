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
public class Task27_global_var_template_case {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double result_kinetic_energy;
    double result_potential_energy;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a<=0 && b <= 0 && c < 0){
        System.out.println("Значение mass должно быть положительным\nЗначение velocity должно быть положительным\nЗначение height должно быть неотрицательным\n");
        return;
    } else {
            if (a<=0){
                      if (b<=0) {
                                System.out.println("Значение mass должно быть положительным\nЗначение velocity должно быть положительным\n");
                                return;   
                          } else
                                if (c<0){
                                System.out.println("Значение mass должно быть положительным\nЗначение height должно быть неотрицательным\n");
                                return;
                                } else
                                    System.out.println("Значение mass должно быть положительным\n");
                                    return;    
            } else
                if (b<=0){
                          if (c<0){
                                System.out.println("Значение velocity должно быть положительным\nЗначение height должно быть неотрицательным\n");
                                return;
                          } else
                                System.out.println("Значение velocity должно быть положительным\n");
                                return;
                } else
                    if (c<0){
                                System.out.println("Значение height должно быть неотрицательным\n");
                                return;
                    }
        result_kinetic_energy = a * Math.pow(b,2)/2;
        result_potential_energy = a * 9.8067 * c;
        System.out.printf("Кинетическая энергия составляет: %.4f Дж\nПотенциальная энергия составляет: %.4f Дж\n", result_kinetic_energy, result_potential_energy);
    }    
    }
}