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

public class Task28_1  {

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
HashSet<Integer> set = new HashSet<>(); // HashSet - это структура данных, в нее могут быть добавлены только недублирующиеся 
// элементы исходного массива, т.к. она проверяет при добавлении, есть ли такой элемент в HashSet на нужном месте. Место зависит от значения, т.е.
// все элементы "5" будут складываться в одно и то же место
// круглые скобки - по аналогии со сканером, обозначаем, что создаем новый экземпляр класса
// Во второй части в угловых скобках можно тип не писать
// В ArrayList выше сложность, т.к. нужно перебирать весь список при добавлении элементов, а в HashSet сразу находится местонахождение элемента

for (int i = 0; i < irr.length; i=i+1) {
    set.add(irr[i]);
    }
   
//сортировать в HashSet нельзя, т.к. в нем нет индексов, пронумеровать элементы нельзя.

System.out.print("Способ 1: \n");

            for (Integer item : set) {   //перебор всех элементов в set последовательно
                    System.out.print(item + " ");
                    }

            System.out.print("\n");
System.out.print("Способ 2: \n");            
            Iterator<Integer> itr = set.iterator(); // итератор не знает, сколько элементов в set. Типа окошечка, которое поочередно высвечивает элементы в списке
            while (itr.hasNext()) { // проверка, есть ли следующий элемент. Если он есть, то продолжаем считывать
                Integer item = itr.next();
                System.out.print(item + " ");
            }
                    
System.out.print("\n");
System.out.print(set.size() + "\n");
}
}
