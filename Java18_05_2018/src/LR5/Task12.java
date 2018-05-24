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
public class Task12 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a;
    a = sc.nextLine();
    if (a.equals("a")){
        System.out.println("a+");
    } else {
        System.out.println("a");
    }
    if (a.equals("b")){
        System.out.println("b+");
    } else {
        System.out.println("b");
    }
    if (a.equals("c")){
        System.out.println("c+");
    } else {
        System.out.println("c");
    }
    }   
}