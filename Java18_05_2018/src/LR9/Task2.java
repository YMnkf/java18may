/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task2 {

    public static void main(String[] args) throws FileNotFoundException {
    
    File target = new File ("./Resourses/task4488/test6.txt");
    if (!target.exists()) {
        System.out.println("Файл " + target.getAbsolutePath()+ " не существует");
        return;
    }
    
    Scanner s = new Scanner (target); // открыли файл, как в текстовом документе. Курсор в самом начале
    
    String line; //объявление переменной line
    
    boolean str1;
    if (s.hasNext()) {
         System.out.print(s.nextLine());
         str1 = true;
    } else {
        str1 = false;
    }
    
    int count = 0;  
    while (s.hasNext()) {
        line = s.nextLine();
        count = count + 1;
    }
    s.close ();
    
    if (str1 == true) {
            System.out.print(" " + count + "\n");
    }
}
}