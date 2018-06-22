/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task21 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr1 = raw1.split(" ");
            
if (arr1.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

   
Integer[] irr = new Integer[arr1.length];
for (int i = 0; i < arr1.length; i++) {
           int iv = Integer.parseInt(arr1[i]);
           irr[i] = iv;
           }

System.out.print("В массиве {");

//for (int i = 0; i < arr1.length; i++) {
//           System.out.print(arr1[i] + " ");
//           }

String result = String.join(" ", Arrays
            .stream(irr)
            .map(String::valueOf)
            .collect(Collectors.toList()));

System.out.print(result + "} минимальный элемент - это ");

double a = Double.parseDouble(arr1[0]);

    for (int i = 0; i < arr1.length; i++) {
           int iv = Integer.parseInt(arr1[i]);
           double dv = Double.parseDouble(arr1[i]);
           if (dv < a) {
                    a = dv;
                    }
           }
System.out.print(a + "\n");
    }
    }