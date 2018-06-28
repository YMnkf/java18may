/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task24 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

double dv;

for (int i = 0; i < arr.length; i++) {
           dv = Double.parseDouble(arr[i]);
           if (dv == a) {
                    arr[i] = String.valueOf((int)b);
                    }
           System.out.print(arr[i] + " ");
           }
System.out.print("\n");
    }
    }