/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;
import java.util.Arrays;



public class Task12 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String line = sc.nextLine();
       
    String line1 = line.replaceAll(" ", "");
     
    String[] arr = line1.split(",");
     
System.out.print(arr.length + "\n");
}
}

