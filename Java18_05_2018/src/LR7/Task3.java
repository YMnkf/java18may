/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    //int a = sc.nextInt();
            
    String[] arr = raw.split(" ");
       
if (arr.length == 0) {
    System.out.print("Исходная строка пуста\n");
    return;
}   
    
//String[] Arr = new String[]{"a","b","c", "d", "e", "f", "g", "h"};

for (int i = arr.length-1; i >=0; i=i-1) {
    System.out.print(arr[i] + " ");
}
    System.out.print("\n");
    }
    }