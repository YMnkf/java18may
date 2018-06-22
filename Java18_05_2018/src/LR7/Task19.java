/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
    String raw2 = sc.nextLine();
       
    String[] arr1 = raw1.split(" ");
    String[] arr2 = raw2.split(" ");
       
if (arr1.length != arr2.length) {
    System.out.print("Размеры массивов должны быть одинаковы\n");
    return;
}   

if (arr1.length == arr2.length && arr2.length == 0) {
    System.out.print("Строки не должны быть пустыми\n");
    return;
}   

   
//String[] Arr = new String[]{"a","b","c", "d", "e", "f", "g", "h"};

int[] irr = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
           int iv1 = Integer.parseInt(arr1[i]);
           int iv2 = Integer.parseInt(arr2[i]);
           double dv = Double.parseDouble(arr1[i]);
           irr[i] = iv1*iv2;
           System.out.print(irr[i]+ " ");
            }
System.out.print("\n");
    }
    }