/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    double a;
    double b;
        
    //int a = sc.nextInt();
    
    String[] arr = raw.split(" ");
    a = sc.nextDouble();
    b = sc.nextDouble();
    
    int start = Math.min((int)a,(int)b);
    int end = Math.max((int)a,(int)b);
    
if (arr.length == 0) {
    System.out.print("Исходная строка пуста\n");
    return;
}   

if (a < 0 || a >= arr.length) {
    System.out.print("Число B должно быть в интервале [0, размер массива)\n");
    return;
} 

if (b < 0 || b >= arr.length) {
    System.out.print("Число E должно быть в интервале [0, размер массива)\n");
    return;
} 

//String[] Arr = new String[]{"a","b","c", "d", "e", "f", "g", "h"};

for (int i = start; i <= end; i=i+1) {
    System.out.print(arr[i] + " ");
}
    System.out.print("\n");
    }
    }