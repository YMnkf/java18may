/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String line = "abcdefwxyz";
    Double a = sc.nextDouble();
    Double b = sc.nextDouble();
    
    if (a < 0 || a>= line.length()) {
        System.out.print("Значение CA должно быть в интервале [0, длина строки)\n");
        return;
    }
    
    if (b <0) {
        System.out.print("Значение CB должно быть неотрицательно\n");
        return;
    }
    
    if (a+b >= line.length) {
        System.out.print("Сумма значений CA и CB должна быть меньше длины строки\n");
        return;
    }   
        
    System.out.print("Код страны: " + line.substring(0, 2) + "\n"); // проверяем включительно от a до b
    System.out.print("Код изготовителя: " + line.substring(3, 6) + "\n"); // проверяем включительно от a до b
    System.out.print("Код товара: " + line.substring(7, 11) + "\n"); // проверяем включительно от a до b
    System.out.print("Контрольное число: " + line.substring(12, 13) + "\n"); // проверяем включительно от a до b
  
    }
    }
