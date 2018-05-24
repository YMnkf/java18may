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
public class Task12_1 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String a;
    int i = 0;
    String[] arr ={"a","b","c","d","e","f","g","h"};
    a = sc.nextLine();
    
    while (i < arr.length) {
        if (a.equals(arr[i])){
            System.out.println(arr[i] + "+");
        } else {
            System.out.println(arr[i]);
        }
        i = i+1;
    } 
    }
}