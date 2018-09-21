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

    public static void main(String[] args) {

        try {
            Task1Object currentObject = fileRead("./Resourses/task9299/test1.txt"); // открыли файл, как в текстовом документе. Курсор в самом начале
            String [] arrSum = countSum(currentObject);

            for (int i = 0; i < arrSum.length; i++) {
                System.out.print(arrSum[i] + " ");
            }


        } catch (FileNotFoundException e) {
            File currentFile = new File("./Resourses\task9299");
            System.out.println("Файл не найден " + currentFile.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Либо:
        // public static void main(String[] args) throws FileNotFoundException {...
        //System.out.print("\n");
    }


    public static Task1Object fileRead(String parthname) throws Exception {
        Task1Object objectData;
        objectData = new Task1Object();

        File target = new File(parthname);
        if (!target.exists()) {
            //System.out.println("Файл " + target.getAbsolutePath()+ " не существует" + "\n");
            //return;
            Exception e = new Exception("Файл " + target.getAbsolutePath() + " не существует");
            throw e;
        }

        Scanner s = new Scanner(target); // открыли файл, как в текстовом документе. Курсор в самом начале

        String lineStr;
        int m;
        int n;
        String[] arr;


        if (s.hasNext()) {
            m = Integer.parseInt(s.nextLine());
        } else {
            //System.out.print("Сообщение об ошибке" + "\n");
            //return;
            Exception e = new Exception("Сообщение об ошибке");
            throw e;
        }

        if (m == 0) { //Как добавить "Не является целым положит числом"?
            //System.out.print("Сообщение об ошибке" + "\n");
            //return;
            Exception e = new Exception("Сообщение об ошибке");
            throw e;
        }

        if (s.hasNext()) {
            n = Integer.parseInt(s.nextLine());
        } else {
            //System.out.print("Сообщение об ошибке" + "\n");
            //return;
            Exception e = new Exception("Сообщение об ошибке");
            throw e;
        }

        if (n == 0) {
            //System.out.print("Сообщение об ошибке" + "\n");
            //return;
            Exception e = new Exception("Сообщение об ошибке");
            throw e;
        }

        double[][] arr1 = new double[m][n];

        for (int i = 0; i < m; i++) {
            if (s.hasNext()) {///////////////////////////////////
                arr = s.nextLine().split(" ");

                for (int j = 0; j < arr.length; j++) {
                    {
                        arr1[i][j] = Double.parseDouble(arr[j]); ////////////////
                    }
                }
            } else {
                //System.out.print("Сообщение об ошибке" + "\n");
                //return;
                Exception e = new Exception("Сообщение об ошибке");
                throw e;
            }

            if (arr.length != n) {
                //System.out.print("Сообщение об ошибке" + "\n");
                //return;
                Exception e = new Exception("Сообщение об ошибке");
                throw e;
            }
        }
        s.close();   //Где это должно быть?

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.print("\n");
        }

        objectData.arr1 = arr1;
        objectData.m = m;
        objectData.n = n;
        return objectData;

    }


    public static String[] countSum(Task1Object objectData) {


        String[] arrSum = new String[objectData.n];

        for (int j = 0; j < objectData.n; j++) {
            double S = 0;
            for (int i = 0; i < objectData.m; i++) {
                S = S + objectData.arr1[i][j];
            }
            arrSum[j] = String.valueOf((double) S);

        }

        return arrSum;
    }
}