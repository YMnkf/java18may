/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task25_1 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
    
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

Integer[] irr = new Integer[arr.length];
      
        
for (int i = 0; i < arr.length; i++) {
           int iv = Integer.parseInt(arr[i]);
           irr[i] = iv;
           }

Arrays.sort(irr);
for (int i = 0; i < irr.length; i=i+1) {
         System.out.print(irr[i] + " ");
           }
System.out.print("\n");
    }
    }