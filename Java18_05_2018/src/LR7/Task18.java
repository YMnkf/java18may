/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    String raw = sc.nextLine();
    
    String[] arr = raw.split(" ");
       
if (arr.length == 0) {
    System.out.print("Дана пустая последовательность\n");
    return;
}   

int count = 0;
double s = 0;

for (int i = 0; i < arr.length; i = i+1) {
    double dv = Double.parseDouble(arr[i]);
    count = count+1;
    s=s+dv;
    }

double qw = 0;
for (int i = 0; i < arr.length; i = i+1) {
    double dv = Double.parseDouble(arr[i]);
    qw = qw + Math.pow((dv - s/count),2);
    //System.out.printf("%.4f ",Math.abs(dv - s/count));
}

System.out.printf("%.4f\n", Math.pow((qw/(count-1)),0.5));        
System.out.print("\n");
}
}
