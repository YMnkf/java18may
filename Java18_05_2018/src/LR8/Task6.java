/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    //String line = sc.nextLine();
    String line = "abcdefwxyz";
    String a = sc.nextLine();
    String b = sc.nextLine();
    
    int indexa = line.indexOf(a, 0);
    //int enda =  line.lastIndexOf(a, 0);
    int indexb = line.indexOf(b, 0);
    //int endb =  line.lastIndexOf(b, 0);  
    
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
    
      
   
    String result = line.substring(start+1, end); // 1 не прибавляем, т.к. проверяем не включительно от ca до cb
    
    System.out.print(result + "\n");
    }
    }