/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String line = "abcdefwxyz";
    String a = sc.nextLine();
    //int index = line.indexOf('-'); // находим позицию дефиса в строке
    int index = line.indexOf(a); // если элемент не нашелся, то index = -1
    
    if (index ==-1) {
        System.out.print("Не содержится\n");
    }
    
    if (index !=-1) {
        System.out.print("Содержится\n");
    }
    
    System.out.print("\n");
    }
    }