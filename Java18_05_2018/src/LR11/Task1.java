/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR11;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {

        File target = new File ("./Resourses/task9299/test1.txt");
        if (!target.exists()) {
            System.out.println("Файл " + target.getAbsolutePath()+ " не существует" + "\n");
            return;
        }

        Scanner s = new Scanner (target); // открыли файл, как в текстовом документе. Курсор в самом начале

        String lineStr;
        int m;
        int n;
        String[] arr;
        

        if (s.hasNext()) {
            m = Integer.parseInt(s.nextLine());
         } else {
            System.out.print("Сообщение об ошибке" + "\n");
            return;
        }

        if (m==0) { //Как добавить "Не является целым положит числом"?
            System.out.print("Сообщение об ошибке" + "\n");
            return;
        }

        if (s.hasNext()) {
            n = Integer.parseInt(s.nextLine());
            //System.out.print(line);
        } else {
            System.out.print("Сообщение об ошибке" + "\n");
            return;
        }

        if (n==0) {
            System.out.print("Сообщение об ошибке" + "\n");
            return;
        }

        double [][] arr1 = new double [m][n];

     for (int i=0; i<m; i++){
            if (s.hasNext()) {///////////////////////////////////
                arr = s.nextLine().split(" ");

                for (int j=0; j<arr.length; j++){
                    {arr1[i][j] = Double.parseDouble(arr[j]); ////////////////
                }
               }
            } else {
                System.out.print("Сообщение об ошибке" + "\n");
                return;
            }

            if (arr.length != n) {
                System.out.print("Сообщение об ошибке" + "\n");
                return;
            }
    }
    s.close ();   //Где это должно быть? 
    
     for (int i=0; i<m; i++){
                for (int j=0; j<n; j++){
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.print("\n");
               }
    
     String[] arrSum = new String [n];
     
     for (int j=0; j<n; j++){
         double S = 0;
         for (int i=0; i<m; i++){
             S = S + arr1[i][j];
         }
             arrSum[j]= String.valueOf((double)S);
    }
     
     for (int i=0; i<arrSum.length; i++){
             System.out.print(arrSum[i] + " ");
     }
     
     System.out.print("\n");
}
}