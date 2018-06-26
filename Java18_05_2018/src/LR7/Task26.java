/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    String[] arr = raw.split(" ");
    int a = sc.nextInt();

    int count = 0;
for (int i = 0; i <= arr.length-1; i=i+1) {
    int iv = Integer.parseInt(arr[i]);
    if (iv == a) {
                count = count + 1;
                } 
}
System.out.print(count + "\n");
}
}