/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String a = sc.nextLine();
     
    String[] arr = new String[]{"a","b","c", "d", "e", "f", "g", "h"};

    int i = 0;
    
    
    
do {
        //a = sc.nextDouble();
        System.out.print(arr[i]);
        if(arr[i].equals(a)) {
            break;
            }
        i++;
    } while (i < arr.length);
          
    //if(!arr[0].equals(arr[1]) && result.equals(arr[2]))

System.out.print("\n");
    }
    }