/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR13;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author pro-26
 */
public class Method_Suite {

    @Test // аннотация к методу Task9020Test. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task9020Test() {
        double result1;
        result1 = Methods.task9020(0); // запись результата вызова метода Methods.task9020 в переменную result1

        Assert.assertEquals(23.4307, // 23.4307 - ожидаемое значение
                result1, //result1 - расчетное значение 
                0.0001); //0.0001 - погрешность

        result1 = Methods.task9020(-9);
        Assert.assertEquals(25.0998, result1, 0.0001);

        Assert.assertEquals(0.0000, Methods.task9020(61), 0.0001);
        
        Assert.assertEquals(3.0000, Methods.task9020(60), 0.0001);
            }
    
    @Test (expected = IllegalArgumentException.class)// аннотация к методу Task9020assertion1. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task9020assertion1() {
        Methods.task9020(62);
}
    
    @Test (expected = IllegalArgumentException.class)// аннотация к методу Task9020assertion1. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task9020assertion2() {
        Methods.task9020(7573);
}
    
    
    @Test (expected = IllegalArgumentException.class)// аннотация к методу Task9020assertion1. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task9020assertion3() {
        Methods.task9020(75);
}
    
@Test // аннотация к методу Task3943Test. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task3943Test() {
        double result1;
        result1 = Methods.task3943(0); // запись результата вызова метода Methods.task39430 в переменную result1

        Assert.assertEquals(-10.0000, // -10.0000 - ожидаемое значение
                result1, //result1 - расчетное значение 
                0.0001); //0.0001 - погрешность

        result1 = Methods.task3943(-5,81);
        Assert.assertEquals(-10.0000, result1, 0.0001);

        Assert.assertEquals(-435.7062, Methods.task3943(7507,7499), 0.0001);
        
    @Test (expected = IllegalArgumentException.class)// аннотация к методу Task3943assertion1. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
    public void Task3943assertion1() {
        Methods.task3943(7489,-7487);
}
        @Test (expected = IllegalArgumentException.class)// аннотация к методу Task3943assertion1. Маркирует элементы кода (чтобы библиотека junit понимала, что этот метод является тестом 
        public void Task3943assertion1() {
        Methods.task3943(-7481,-7477);
}    
    
   
}
    
