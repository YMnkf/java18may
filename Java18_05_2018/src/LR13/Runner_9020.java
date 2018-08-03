/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR13;

/**
 *
 * @author pro-26
 */
public class Runner_9020 {
    
    public static void main (String[] args) {
    double result = Methods.task9020(0);
    System.out.printf("%.4f\n", result);
    result = Methods.task9020(-9);
    System.out.printf("%.4f\n",result);
    result = Methods.task9020(61);
    System.out.printf("%.4f\n",result);
    result = Methods.task9020(60);
    System.out.printf("%.4f\n",result);
    
    try {
        Methods.task9020(62);
    } catch (IllegalArgumentException ex) {
        String message = ex.getMessage();
        System.out.println(message);
    }
    
    try {
        Methods.task9020(7573);
    } catch (IllegalArgumentException ex) {
        String message = ex.getMessage();
        System.out.println(message);
    }
    
    try {
        Methods.task9020(75);
    } catch (IllegalArgumentException ex) {
        String message = ex.getMessage();
        System.out.println(message);
    }
    
    Methods.task9020(85);
    
    }
}
