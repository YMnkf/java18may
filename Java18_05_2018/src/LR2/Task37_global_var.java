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
public class Task37_global_var {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result;
    a = sc.nextDouble();
    if (a < 0){
               System.out.println("Высота над уровнем Земли должна быть неотрицательна\n");
               return;    
    }
        result = Math.pow(Math.pow(a+6350,2)-Math.pow(6350,2),0.5);
        System.out.printf("%.4f\n", result);
    }    
    }