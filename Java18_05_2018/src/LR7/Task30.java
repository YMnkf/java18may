/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Task30  { // вывести матрицу смежности для графа:
    // 1 - 3, 1 - 2, 2 - 3, 1 - 4, 4 - 6, 2 - 5

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    int n = 5;
    int [][] matrix = new int[n][n];
    matrix [0][0] = 9;
        
    System.out.println(matrix[0][0]);
    
System.out.print("\n");

}
}
