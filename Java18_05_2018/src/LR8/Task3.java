/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    //String line = sc.nextLine();
    String line = "abcdefwxyz";
    String a = sc.nextLine();
    String b = sc.nextLine();
    //int index = line.indexOf('-'); // находим позицию дефиса в строке
    int indexa = line.indexOf(a); // если элемент не нашелся, то index = -1
    int indexb = line.indexOf(b);
    
    if (indexa ==-1) {
        System.out.print("Значение CA отсутствует в строке\n");
        return;
    }
    if (indexb ==-1) {
        System.out.print("Значение CB отсутствует в строке\n");
        return;
    }
    
    
    int start;
    int end;
    
    if (indexa >= indexb) {
        start = indexb;
        end = indexa;
    } else {
        start = indexa;
        end = indexb;
    }
    
        
    System.out.print(end - start-1 + "\n");
    }
    }