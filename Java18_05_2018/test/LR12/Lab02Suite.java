/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR12;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author pro-26
 */
public class Lab02Suite {

    @Test // аннотация к методу Task4411Test. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task4411Test() {
        double result1;
        result1 = Lab01.task4411(11.13); // запись результата вызова метода Lab01.task4411 в переменную result1

        Assert.assertEquals(18.1300, // 18.1300 - ожидаемое значение
                result1, //result1 - расчетное значение 
                0.0001); //0.0001 - погрешность

        result1 = Lab01.task4411(-7919);
        Assert.assertEquals(-7912, result1, 0.0001);

        Assert.assertEquals(7.0000, Lab01.task4411(0), 0.0001);
    }

    @Test // аннотация к методу Task2790Test. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task2790Test() {
        double result1;
        result1 = Lab01.task2790(6997); // запись результата вызова метода Lab01.task2790 в переменную result1

        Assert.assertEquals(0.9205, // 0.9205 - ожидаемое значение
                result1, //result1 - расчетное значение 
                0.0001); //0.0001 - погрешность

        result1 = Lab01.task2790(31);
        Assert.assertEquals(0.8572, result1, 0.0001);

        Assert.assertEquals(0.0000, Lab01.task2790(90), 0.0001);

        Assert.assertEquals(1.0000, Lab01.task2790(0), 0.0001);

        Assert.assertEquals(1.0000, Lab01.task2790(180), 0.0001);
    }

    @Test // аннотация к методу Task3946Test. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task3946Test() {
        double result1;
        int[] arr = new int[]{1, 2, 3, 4, 1};

        result1 = Lab01.task3946(arr); // запись результата вызова метода Lab01.task2790 в переменную result1

        Assert.assertEquals(2.2, // 2.2 - ожидаемое значение
                result1, //result1 - расчетное значение 
                0.0001); //0.0001 - погрешность

        arr = new int[]{1, 2, 3, 4, 1, 3, 4, 4, 4, 4};
        result1 = Lab01.task3946(arr);
        Assert.assertEquals(3.0000, result1, 0.0001);

        Assert.assertEquals(0.0000, Lab01.task3946(new int[0]), 0.0001);

    
}
    
    @Test // аннотация к методу Task3946Test. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task9774Test() {
        double a1 = 31;
        double[] data1 = new double[]{9, 8, 7, 6, 5, 4};
        double[] data1_result = new double[]{279, 248, 217, 186, 155, 124};
        Lab01.task9774(a1, data1); 
        Assert.assertArrayEquals(data1_result, data1, 0.0001);
        
        double a2 = -3;
        double[] data2 = new double[]{9, 8, 7, 6, 5, 4};
        double[] data2_result = new double[]{-27, -24, -21, -18, -15, -12};
        Lab01.task9774(a2, data2); 
        Assert.assertArrayEquals(data2_result, data2, 0.0001);
        
        double a3 = 11;
        double[] data3 = new double[]{98, 76, 54};
        double[] data3_result = new double[]{1078, 836, 594};
        Lab01.task9774(a3, data3); 
        Assert.assertArrayEquals(data3_result, data3, 0.0001);
        
        double a4 = 73;
        double[] data4 = new double[0];
        double[] data4_result = new double[0];
        Lab01.task9774(a4, data4);
        Assert.assertArrayEquals(data4_result, data4, 0.0001);
}
}
