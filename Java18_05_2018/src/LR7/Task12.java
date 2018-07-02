/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
    String raw2 = sc.nextLine();
        
    String[] arr1 = raw1.split(" ");
    String[] arr2 = raw2.split(" ");
       
if (arr1.length == 0) {
    System.out.print("Данные сверху отсутствуют\n");
    return;
}

if (arr2.length == 0) {
    System.out.print("Данные слева отсутствуют\n");
    return;
}  

System.out.print(" ");

for (int i=0; i < arr1.length; i=i+1) {
    System.out.print(arr1[i]);
}
System.out.print(" \n");

for (int i=0; i < arr2.length; i=i+1) {
    System.out.print(arr2[i]);
    for (int j=0; j<arr1.length; j=j+1) {
         if (arr2[i].equals(arr1[j])) {
            System.out.print("+"); 
                    } else {
                    System.out.print(" ");
         };
        }
     System.out.print("|\n");
}


System.out.print(" ");
for (int i=0; i < arr1.length; i=i+1) {
    System.out.print("_");
}
System.out.print(" ");


System.out.print(" \n");
}
}
