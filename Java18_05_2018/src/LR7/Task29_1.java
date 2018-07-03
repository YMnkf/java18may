/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task29_1 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
           
    String[] arr = raw.split(" ");
    
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

Integer[] irr = new Integer[arr.length];
for (int i = 0; i < arr.length; i=i+1) {
           int iv = Integer.parseInt(arr[i]);
           irr[i] = iv;
           }

Integer[] irr1 = new Integer[arr.length];
irr1[0] = irr [0];

for (int i = 1; i < irr.length; i=i+1) {
            int count = 0;
            for (int j=0; j < i; j=j+1) {   
                if (irr[i].equals(irr1[j])) {
                        count= count+1;
                        }
            }
            if (count == 0) {
                   irr1[i] = irr[i];
                  }             
}

int count1=0;
for (int i = 0; i < irr1.length; i=i+1) {
           System.out.print(irr1[i] + " ");
           if (irr1[i] != null) {
            count1 = count1+1;
                }
       }

System.out.print("\n");

System.out.print(count1 + "\n");
    }
}

