/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR5;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author adm
 */
public class Task14_array_operations {
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
    Double[] arr1 = {a,b,c};
        
    int count1 = 0;
    
    while (i < arr1.length) {
        if (arr1[i] > -3 && arr1[i] < 5){
            count1=count1+1;
        } 
        i = i+1;  
        }
    
    Double[] arr2 = new Double[count1];
    int count2 = 0;
    
    i = 0;
    while (i < arr1.length) {
        if (arr1[i] > -3 && arr1[i] < 5){
            arr2[count2] = arr1[i];
            count2=count2+1;
        } 
        i = i+1;  
        }
    
    System.out.println(Arrays.toString(arr2));
    
    List<String> strs = Stream.of(arr2)
               .map(Object::toString)
               .collect(Collectors.toList());
    System.out.println(String.join("; ", strs));
}
}
   
