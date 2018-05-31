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
public class Task13_cases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double result;
        a = sc.nextInt();
        b = sc.nextInt();
        switch (a) {
            case 0:
                switch (b) {
                    case 0:
                        System.out.println("Значение a должно быть ненулевым,\nЗначение b должно быть ненулевым");
                        break;
                    default:
                        System.out.println("Значение a должно быть ненулевым\n");
                        break;
                }
                break;
            default:
                switch (b) {
                    case 0:
                        System.out.println("Значение b должно быть ненулевым");
                        break;
                    default:
                        System.out.println(a*b);
                        break;
                } 
                break;
                
        }
    }
}
