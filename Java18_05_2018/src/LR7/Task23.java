/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task23 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int start;
    int end;

if (a<b) {
    start = a;
    end = b;
} else {
    start = b;
    end = a;
}
            
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   
if (a <0 || a>= arr.length) {
    System.out.print("Число P должно быть в интервале [0, размер массива)\n");
    return;
} 
if (b <0 || b>= arr.length) {
    System.out.print("Число Q должно быть в интервале [0, размер массива)\n");
    return;
} 

double f = Double.parseDouble(arr[start]);

for (int i = start; i <= end; i++) {
           double dv = Double.parseDouble(arr[i]);
           if (dv < f) {
                    f = dv;
                    }
           }
    
  
System.out.print(f + "\n");
    }
    }