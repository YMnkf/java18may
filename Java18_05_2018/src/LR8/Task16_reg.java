/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task16_reg {

    public static void main(String[] args) {
    //Переменная состоит из частей:
    //* один или несколько символов, кроме пробелов
    //* ноль или несколько пробелов x<3, x   < 3, x <   3
    //* знак сравнения
    //* ноль или несколько пробелов
    //* одна или более цифр без пробелов
    
    String[] test = {
        "x>3",
        ">3",
        "a>3",
        "b>3",
        "xy>3",
        "x > 3",
        "x>123"
    };
    
    Pattern p = Pattern.compile("[a-z]+[ ]*(>|<|==|>=|<=|!=)[ ]*[0-9]+");// [] - это группы, 
    // {} - сколько должно быть элементов, если знаем их точное количество
    // {*} - 0 или более
    // {+} - 1 или более
    // от 1 до бесконечности элементов - это "+"
    // квантификатор
    for (int i = 0; i < test.length; i = i+1) {//Получаем информацию о соответствии строки шаблону
    Matcher m = p.matcher(test[i]);
    System.out.print(test[i]); // для вывода сообщения о результате проверки
    if (m.matches()) {//проверка на соответствие шаблону
        System.out.print(" совпадает\n");
    } else {
        System.out.print(" не совпадает\n");
    }
    }
    }
    }
