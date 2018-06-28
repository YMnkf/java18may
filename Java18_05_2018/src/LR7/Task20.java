/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    int a = sc.nextInt();
    
    String[] arr = raw.split(" ");
       
if (arr.length == 0) {
    System.out.print("Дана пустая последовательность\n");
    return;
}
if (a < 0 || a >= arr.length) {
    System.out.print("Число B должно быть в интервале [0, размер массива)\n");
    return;
}  


int count = 0;

for (int i = 0; i < arr.length; i = i+1) {
    double dvi = Double.parseDouble(arr[i]);
    double dva = Double.parseDouble(arr[a]);
    if ((dvi-dva)<0) {
    count = count+1;
    }
    }
    
System.out.print(count + "\n");
}
}