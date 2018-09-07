/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR12;

import java.util.Scanner;

public class Lab01 {

    public static void task1860(String a) { //публичный статический метод
        System.out.println("Мы стремимся к " + a); // тело метода
    }

    public static void task4140(String a, String b) {
        System.out.println("Меня зовут " + a + ", " + b + " " + a);
    }

    public static double task4411(double a) { //void - означает, что метод не возвращает значения, double - означает, что метод возвращает значения типа double
        double result;
        result = a + 7;
        return result; //возврат значения

    }

    public static double task2790(double a) { //void - означает, что метод не возвращает значения, double - означает, что метод возвращает значения типа double
        double result;
        result = Math.pow((1 - Math.pow(Math.sin(Math.toRadians(a)), 2)), 0.5);
        return result; //возврат значения

    }

    public static double task3946(int[] args) {

        double result;

        if (args.length == 0) {
            result = 0;
            return result; // дальше этого return программа не пойдет, будет осуществлен выход из текущего метода
        }

        int count = 0;
        double result1 = 0;
        for (int i = 0; i < args.length; i = i + 1) {
            count = count + 1;
            result1 = result1 + args[i];
        }
        result = result1 / count;
        return result;
    }

    public static void task9774(double a, double[] args) {

        if (args.length == 0) {
            return;
        }
        for (int i = 0; i < args.length; i = i + 1) {
            args[i] = args[i] * a;
        }

    }

    public static void task9271(double[] arr) {
        if (arr.length == 0) {
            return;
        }
        double a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            double dv = arr[i];
            if (dv < a) {
                a = dv;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            double dv = arr[i];
            arr[i] = dv-a;
        }
        }
}

