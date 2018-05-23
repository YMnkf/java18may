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
public class Task8 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a, b;
    a = sc.nextLine();
    b = sc.nextLine();
    String c;
    c = "INSERT INTO points (x, y) VALUES ('" + a + "', '" + b + "');";
    System.out.println(c);
            } 
}

