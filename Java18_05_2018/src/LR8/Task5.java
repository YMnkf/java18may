/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    //String line = sc.nextLine();
    String line = "abcdefwxyz";
    int ca = sc.nextInt();
    int cb = sc.nextInt();
    
      
    if (ca < 0 || ca > line.length()) {
        System.out.print("Значение CA должно быть в интервале [0,длина строки)\n");
        return;
    }
    if (cb < 0 || cb > line.length()) {
        System.out.print("Значение CB должно быть в интервале [0,длина строки)\n");
        return;
    }
    if (ca > cb) {
        System.out.print("Значение CA должно быть меньше или равно CB\n");
        return;
    }
    String result = line.substring(ca, cb+1); // 1 прибавляем, т.к. проверяем включительно до cb
    
    System.out.print(result + "\n");
    }
    }