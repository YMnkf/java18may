/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task27 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
    
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

Integer[] irr = new Integer[arr.length];

for (int i = 0; i < arr.length; i=i+1) {
        int count = 0;
        for (int j=0; j < arr.length; j=j+1) {   
            if (arr[i].equals(arr[j])) {
                    count= count+1;
                    }
        }    
            irr[i] = count;
            System.out.print(irr[i] + " ");
        }
           
System.out.print("\n");
    }
    }