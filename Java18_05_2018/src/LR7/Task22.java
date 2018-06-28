/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task22 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
            
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

   
double a = Double.parseDouble(arr[0]);

for (int i = 0; i < arr.length; i++) {
           double dv = Double.parseDouble(arr[i]);
           if (dv < a) {
                    a = dv;
                    }
           }
    
Double[] irr = new Double[arr.length];

    for (int i = 0; i < arr.length; i++) {
           double dv = Double.parseDouble(arr[i]);
           irr[i] = dv-a;
           System.out.print(irr[i] + " ");
    }
    
System.out.print("\n");
    }
    }