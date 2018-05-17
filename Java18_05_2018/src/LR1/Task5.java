/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR1;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Task5 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a, b;
    a = sc.nextLine();
    b = sc.nextLine();
    //System.out.println(b +" " + a); // 1 способ 
    
    //System.out.print(b); // 2 способ
    //System.out.print(" ");
    //System.out.println(a);
    
    String c;
    c = b + " " + a;
    System.out.println(c);
            } 
}
