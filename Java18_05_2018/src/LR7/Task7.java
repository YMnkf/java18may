/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    int offset = sc.nextInt();
    
    String[] arr = raw.split(" ");
    String[] arr1 = new String [arr.length + Math.abs(offset)];
       
if (arr.length == 0) {
    System.out.print("Исходная строка пуста\n");
    return;
}   

int k = offset%arr.length;
int m = (int) (offset/arr.length);


if (offset>=0) {
       for (int j = 0; j < k; j = j+1) {
           arr1[j] = arr[arr.length-k+j];
           System.out.print(arr1[j] + " ");
       }
        for (int j = k; j < arr1.length; j = j+1) {
                   arr1[j] = arr[(int)((j-k)%arr.length)]; // нужно несколько раз написать arr слева
                   System.out.print(arr1[j] + " ");
            }
        System.out.print("\n");
        for (int i = 0; i < arr.length; i = i+1) {
            arr[i] = arr1[i];
            System.out.print(arr[i] + " ");
        }
}
if (offset<0) {
        for (int j = arr1.length-Math.abs(offset); j < arr1.length; j = j+1) {
                   arr1[j] = arr[j%arr.length];
                   System.out.print(arr1[j] + " ");
            }
        for (int j = 0; j < arr1.length-Math.abs(offset); j = j+1) {
           arr1[j] = arr[(int)(j%arr.length)]; // нужно несколько раз написать arr слева
           System.out.print(arr1[j] + " ");
       }
        System.out.print("\n");
        for (int i = 0; i < arr.length; i = i+1) {
            arr[i] = arr1[i+Math.abs(offset)];
            System.out.print(arr[i] + " ");
        }
}
System.out.print("\n");
}
}
