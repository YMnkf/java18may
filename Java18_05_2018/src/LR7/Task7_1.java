/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task7_1 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in); 
    String raw = sc.nextLine(); 
    int offset = sc.nextInt(); 
    String[] arr = raw.split(" "); 
    String[] arr1 = new String [arr.length]; 

    
    if (arr.length == 0) { 
    System.out.print("Исходная строка пуста\n"); 
    return; 
        }    
 
if (offset>=0) { 
       for (int i = 0; i < arr.length; i = i+1) { 
           arr1[(i+offset)%arr.length] = arr[i]; 
       } 
   
       for (int i = 0; i < arr1.length; i = i+1) { 
           System.out.print(arr1[i] + " "); 
       } 
}
       
if (offset<0) { 
       for (int i = 0; i < arr.length; i = i+1) { 
           if ((i+offset)>=0) { 
           arr1[(i+offset)%arr.length] = arr[i]; 
           } 
           if ((i+offset)<0) { 
           arr1[(arr.length+i+offset%arr.length)%arr.length] = arr[i]; 
           } 
       } 
       for (int i = 0; i < arr1.length; i = i+1) { 
           System.out.print(arr1[i] + " "); 
       } 
} 
System.out.print("\n"); 
} 
} 