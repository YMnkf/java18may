/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    
   
int[] arr = new int[]{11,13,17,19,10,12,14,15,16,18,20};

for (int i = 0; i <= arr.length-1; i=i+1) {
    if (arr[i] == a) {
                System.out.print(arr[i] + "+\n");
                } else {
                    System.out.print(arr[i] + "\n");
                    }
}
}
}