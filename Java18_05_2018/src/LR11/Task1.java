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
            System.out.println("Файл " + target.getAbsolutePath()+ " не существует");
            return;
        }

        Scanner s = new Scanner (target); // открыли файл, как в текстовом документе. Курсор в самом начале

        String lineStr;
        int m;
        int n;
        String[] arr;


        if (s.hasNext()) {
            m = Integer.parseInt(s.nextLine());
            //System.out.print(line);
        } else {
            System.out.print("Сообщение об ошибке");
            return;
        }

        if (m==0) {
            System.out.print("Сообщение об ошибке");
            return;
        }

        if (s.hasNext()) {
            n = Integer.parseInt(s.nextLine());
            //System.out.print(line);
        } else {
            System.out.print("Сообщение об ошибке");
            return;
        }

        if (n==0) {
            System.out.print("Сообщение об ошибке");
            return;
        }

        double [][] arr1 = new double [m][n];

     for (int i=0; i<m-2; i++){
            if (s.hasNext()) {///////////////////////////////////
                arr = s.nextLine().split(" ");

                for (int j=3; j<arr.length; j++){
                    {arr1[i][j-3] = Double.parseDouble(arr[i]); ////////////////
                }
             } else {
                System.out.print("Сообщение об ошибке");
                return;
            }

            if (arr.length != n) {
                System.out.print("Сообщение об ошибке");
                return;
            }
        }











        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }

        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }
        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }
        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }
        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }
        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }

        if (s.hasNext()) {
            line = s.nextLine();
            System.out.print(", " + line);
        }

        System.out.print("\n");


        s.close ();

    }
}
