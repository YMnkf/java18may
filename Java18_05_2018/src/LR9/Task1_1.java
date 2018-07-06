/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task1_1 {

    public static void main(String[] args) throws FileNotFoundException {
    
    File directory = new File("./Resourses/task6175/");
    File[] content = directory.listFiles();// получение списка файлов массивом
  
    for (int i = 0; i < content.length; i = i + 1) {
        System.out.print("Обработка файла " + content[i] + "\n");
        File target = content [i];
    
    Scanner s = new Scanner (target); // открыли файл, как в текстовом документе. Курсор в самом начале
    
    String line; //объявление переменной line
    
    if (s.hasNext()) {
        line = s.nextLine();
        System.out.print(line);
    }
    
    while (s.hasNext()) {
        line = s.nextLine();
        System.out.print(", " + line);
    }
    s.close ();
    System.out.print("\n");
    }
}
}
