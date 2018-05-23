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
public class Task4 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a;
    a = sc.nextLine();
    //System.out.println("Программирование это " + a +"!"); // 1 способ 
    
    //System.out.print("Программирование это "); // 2 способ
    //System.out.print(a);
    //System.out.println("!");
    
    String b;
    b = "Программирование это " + a + "!";
    System.out.println(b);
            } 
}
