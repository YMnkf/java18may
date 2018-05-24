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
public class Task21 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result_amount;
    double result_rest;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a<=0){
        System.out.printf("Длина рулона должна быть положительна");
        return;
    }
    if (b < 0) {
        System.out.printf("Расход материала должен быть положительным");
        return;
    }
    if (a*100 < b) {
        System.out.printf("Материала не хватит даже на одно изделие");
        return;
    }
    result_amount = Math.floor(100 * a / b);
    //result_rest = 100*a-Math.floor(100 * a / b)*b; - 1 способ
    result_rest = 100 * a % b; // 2 способ, с помощью остатка от деления на b 
    //System.out.printf("%.4f\n", result_amount + " шт и " + result_rest + " см"); - развернутый вариант
    System.out.printf("%.4f шт и %.4f см\n", result_amount , result_rest);
    } 
    
}
