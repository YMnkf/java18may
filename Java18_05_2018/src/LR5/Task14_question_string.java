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
public class Task14_question_string {
    public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    double a;
    double b;
    double c;
    //double result_a;
   // double result_b;
   // double result_c;
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    
    int i = 0;
    Double[] arr ={a,b,c};
    
    while (i < arr.length) {
        if (arr[i] > -3 && arr[i] < 5){
            System.out.print(arr[i]+" ");
        } else {
            System.out.print("");
        }
        i = i+1;  
        } 
    System.out.print("\n");
}
}
    
   // if (a > -3 && a < 5){
   //             result_a = a;
   // } else {
   //     result_a = "";
  //       }
  //  if (b > -3 && b < 5){
  //              result_b = b;
  //  } 
 //   if (c > -3 && c < 5) {
  //               result_c = c;
  //  }
  //  System.out.printf("%.4f; %.4f; %.4f\n", result_a, result_b, result_c);
