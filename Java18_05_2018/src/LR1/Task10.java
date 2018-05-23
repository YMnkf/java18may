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
public class Task10 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a, b, c, d, e;
    a = sc.nextLine();
    b = sc.nextLine();
    c = sc.nextLine();
    d = sc.nextLine();
    e = sc.nextLine();
    String f;
    f = "User ID=" + a + ";Password=" + b + ";Host=" + c + ";Port=" + d + ";Database=" + e;
    System.out.println(f);
            } 
}
