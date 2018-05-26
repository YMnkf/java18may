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
public class Task1 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    a = sc.nextDouble();
    b = sc.nextDouble();
    if (a-b < 0){
                  System.out.println("Второе");
    }
    if (a - b == 0){
                    System.out.println("Равны");
    }
    if (a - b > 0){
                System.out.println("Первое");
    }
    }
    }