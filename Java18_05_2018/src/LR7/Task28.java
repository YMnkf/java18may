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
import java.util.ArrayList;

public class Task28  {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw1 = sc.nextLine();
           
    String[] arr = raw1.split(" ");
    
if (arr.length == 0) {
    System.out.print("Строка не должна быть пустой\n");
    return;
}   

Integer[] irr = new Integer[arr.length];

for (int i = 0; i < arr.length; i++) {
           int iv = Integer.parseInt(arr[i]);
           irr[i] = iv;
           }

ArrayList<Integer> List = new ArrayList <> (); // круглые скобки - по аналогии со сканером, обозначаем, что создаем новый экземпляр класса.
// Во второй части в угловых скобках можно тип не писать.


for (int i = 0; i < irr.length; i=i+1) {
    boolean found = false;
        for (int j = 0; j < List.size(); j=j+1) { // просматриваем все элементы массива
            if (List.get(j) == irr[i]) {
                found = true; // отмечаем, что нашли текущий элемент массива в списке
                break;
            }
        }
        if (!found) { // если не отметили, что нашли такой же элемент
            List.add(irr[i]); // добавляем этот элемент в список
        }  
}
   
Collections.sort(List);

            for (int j=0; j < List.size(); j=j+1) {   
                    System.out.print(List.get(j) + " ");
    }
System.out.print("\n");
System.out.print(List.size() + "\n");
}
}
