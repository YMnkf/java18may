/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Task14 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
    
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   


HashSet<String> set = new HashSet<>(); 
       for (int i = 0; i < arr.length; i=i+1) {
    set.add(arr[i]);
    }

if (set.size() < arr.length) {
    System.out.print("Повторения есть");
    } else {
     System.out.print("Повторений нет");
}                   
System.out.print("\n");    
}
}
