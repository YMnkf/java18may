/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR12;

import java.util.Scanner;

public class Task_example {

    public static void example (int a) {//метод ничего не возвращает, при передаче значения
    //в метод оно копируется
    a = a*2;
        System.out.println("inside" + a);
    }

    public static int example2 (int b) {// при передаче значения в метод
    //оно копируется и возвращается в новый метод в неизменном виде
    b = b*2;
    return b;
    }

    public static void example3 (int [] arr) {//при передаче значения
    //в метод оно не копируется, т.к. тип переменой - массив
    for  (int i = 0; i < arr.length; i=i+1) {
        arr[i] = arr[i]*2;
    }
    }
        
        
    public static int[] example4 (int [] arr) {//при передаче значения
    //в метод оно не копируется, т.к. тип переменой - массив. Это передача по ссылке
    for  (int i = 0; i < arr.length; i=i+1) {
        arr[i] = 0;
    }
    return arr; // 
    }

    public static String example5 (String a) { // при передаче значения в метод
    //оно копируется и возвращается. Переменные типа String передаются по ссылке
    String c;
    c = "Новая строка - " + a;
    return c;
    }
    
    public static void example6 (String a) { // при передаче значения в метод
    //оно копируется и возвращается. Переменные типа String передаются по ссылке, но при 
    //изменении строки внутри метода создается новая строка, которая занимает новую ячейку памяти и не передается в
    //измененном виде в метод, откуда вызывается данный метод
    a = "Новая строка - " + a;
    }
    
    public static void main (String[] args) {
    int input = 7;
    example(input);
    System.out.println("outside " + input);// выдаст "7"
    
    int b = 10;
    int c = example2(b);
    System.out.println("returne " + c);// возвращает "20"
    
    int[] arr = {3, 4, 5};
    example3(arr);
    System.out.println(arr[0]);// возвращает "6"
    System.out.println(arr[1]);// возвращает "8"
    System.out.println(arr[2]);// возвращает "10"
    
    arr = example4(arr);
    System.out.println(arr[0]);// возвращает "0"
    System.out.println(arr[1]);// возвращает "0"
    System.out.println(arr[2]);// возвращает "0"
    
    String a = "Базовая строка";
    System.out.println(example5(a));
    
    String a1 = "Базовая строка";
    example6(a1);
    System.out.println(a1);
    }
    }

    