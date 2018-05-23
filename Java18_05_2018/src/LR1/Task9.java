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
public class Task9 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a, b, c, d;
    a = sc.nextLine();
    b = sc.nextLine();
    c = sc.nextLine();
    d = sc.nextLine();
    String e;
    e = "<circle cx=\"" + a + "\" cy=\"" + b + "\" r=\"" + c + "\" fill=\"" + d + "\"/>";
    System.out.println(e);
            } 
}
