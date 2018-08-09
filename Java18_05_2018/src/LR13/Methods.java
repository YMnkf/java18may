/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR13;

import java.util.Scanner;

public class Methods {

    public static double task9020(double a) {
    double result;
    if (61-a<0){
        IllegalArgumentException exception; //объявляем переменную exception
        exception = new IllegalArgumentException ("Подкоренное выражение должно быть неотрицательным");//
        //создаем экземпляр типа IllegalArgumentException и инициализируем переменную exception 
        throw exception;//выбросить исключение
    }
        result = 3*Math.pow(61-a,0.5);
return result;   
}
    
 public static double task3943(double a, double b) {
    double result;
    if (b<0){
        IllegalArgumentException exception1; //объявляем переменную exception1
        exception1 = new IllegalArgumentException ("Значение y должно быть неотрицательным");//
        //создаем экземпляр типа IllegalArgumentException и инициализируем переменную exception1
        throw exception1;//выбросить исключение
    }
    
    if (a+Math.sqrt(b)<0){
        IllegalArgumentException exception2; //объявляем переменную exception2
        exception2 = new IllegalArgumentException ("Подкоренное выражение должно быть неотрицательным");//
        //создаем экземпляр типа IllegalArgumentException и инициализируем переменную exception2 
        throw exception2;//выбросить исключение
    }
    
        result = -5*Math.sqrt(a + Math.sqrt(b));
return result;   
}
}

    