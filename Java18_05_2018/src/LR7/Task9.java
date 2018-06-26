/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String a = sc.nextLine();
    
   
String[] arr = new String[]{"a","b","c", "d", "e", "f", "g", "h"};

for (int i = 0; i <= arr.length-1; i=i+1) {
    if (arr[i].equals(a)) {
                System.out.print(arr[i] + "+\n");
                } else {
                    System.out.print(arr[i] + "\n");
                    }
}
}
}