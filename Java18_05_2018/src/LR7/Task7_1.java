/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    int offset = sc.nextInt();
    
    String[] arr = raw.split(" ");
    
       
if (arr.length == 0) {
    System.out.print("Исходная строка пуста\n");
    return;
}   


for (int i = 0; i < arr.length; i = i+1) {
          arr1[(i+offset)%arr.length] = arr[i];
   }
       
      
       
}
System.out.print("\n");
}
}