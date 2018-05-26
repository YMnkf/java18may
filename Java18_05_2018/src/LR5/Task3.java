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
public class Task3 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    a = sc.nextDouble();
    if (a > 0){
                  System.out.println(Math.pow(a, 0.5));
    } else
        System.out.println(Math.pow(a, 2));
    }
    }   