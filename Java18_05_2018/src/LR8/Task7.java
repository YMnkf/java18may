/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String line = sc.nextLine();
    
    if (line.length() != 13) {
        System.out.print("Некорректная длина штрих-кода\n");
        return;
    }
        
    System.out.print("Код страны: " + line.substring(0, 2) + "\n"); // проверяем включительно от a до b
    System.out.print("Код изготовителя: " + line.substring(3, 6) + "\n"); // проверяем включительно от a до b
    System.out.print("Код товара: " + line.substring(7, 11) + "\n"); // проверяем включительно от a до b
    System.out.print("Контрольное число: " + line.substring(12, 13) + "\n"); // проверяем включительно от a до b
  
    }
    }

