/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR2;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Task23 {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double result_hour;
    double result_minute;
    double result_second;
    a = sc.nextDouble();
    if (a<0){
        System.out.printf("Количество времени должно быть неотрицательным\n");
        return;
    }
    result_hour = Math.floor(a / (60*60));
    result_minute = Math.floor((a-result_hour*60*60)/60);
    result_second = a-(result_hour*60*60+result_minute*60);
    System.out.printf("%.4f часов %.4f минут %.4f секунд\n", result_hour , result_minute, result_second);
    } 
}
