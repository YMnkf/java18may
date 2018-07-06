/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
  
    File target = new File ("./Resourses/task6175/test1.txt");
    if (!target.exists()) {
        System.out.println("Файл " + target.getAbsolutePath()+ " не существует");
        return;
    }
    
    Scanner s = new Scanner (target); // открыли файл, как в текстовом документе. Курсор в самом начале
    
    String line;
    
    if (s.hasNext()) {
        line = s.nextLine();
        System.out.print(line);
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
