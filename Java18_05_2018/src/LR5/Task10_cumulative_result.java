/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR5;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Task10_cumulative_result {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    double result_a;
    double result_b;
    double result_c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if (a >= 0){
                result_a = Math.pow(a,2);
    } else {
            result_a = a;
            }
    if (b >= 0){
                result_b = Math.pow(b,2);
    } else {
            result_b = b;
            }
    if (c >= 0) {
                 result_c = Math.pow(c,2);
    } else {
            result_c = c;
             }
    System.out.printf("%.4f; %.4f; %.4f\n", result_a, result_b, result_c);
}
}



//if (a >= 0){
   //             System.out.println(String.format("%.4f",Math.pow(a,2)) + "; ");
  //  } else {
  //          System.out.println(String.format("%.4f",a) + "; ");
   //         }
  //  if (b >= 0){
   //             System.out.println(String.format("%.4f",Math.pow(b,2)) + "; ");
  //  } else {
   //         System.out.println(String.format("%.4f",b) + "; ");
    //        }
   // if (c >= 0) {
   //              System.out.println(String.format("%.4f",Math.pow(c,2)) + "\n");
   // } else {
   //         System.out.println(String.format("%.4f",c) + "\n");
   //          }