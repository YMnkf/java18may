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
public class Task13_question_cases {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double result;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a<=0 && b>0){
        System.out.println("Значение base должно быть положительным");
        return;
    } else {
            if (a>0 && b<=0){
                System.out.println("Значение height должно быть положительным");
                return;
            }
            else {
            if ((a<=0 && b<=0)){
                System.out.println("Значение base должно быть положительным,\nЗначение height должно быть положительным");
                return;
            }
            } 
        result = a * b / 2;
        System.out.printf("%.4f\n", result);
}
}
}
