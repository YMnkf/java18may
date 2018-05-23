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
public class Task7 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a;
    a = sc.nextLine();
    String b;
    b = "SELECT first_name, last_name, group\n" +
        "FROM students WHERE student_id = '" + a + "'";
    System.out.println(b);
            } 
}
