/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR9;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException; //Input - Output Exception
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.Enumeration;

public class Task2_1_zip {

    public static void main(String[] args) throws IOException {
    
    String filename = "./Resourses/task4488/testAll.zip";
    File file = new File (filename); 
    
    if (!file.exists()) {
        System.out.println("Архив " + file.getAbsolutePath()+ " не существует");
        return;
    }
    
    ZipFile zip = new ZipFile(filename); // объявление переменной zip. Создали объект для работы с архивом и открыли его
    
    //Объявляем переменную для списка элементов архива
    Enumeration<? extends ZipEntry> entries; // это аналог коллекции
    //Получаем список элементов архива 
    entries = zip.entries();
    
    while (entries.hasMoreElements()) {
        ZipEntry entry; //Переменная entry для элемента архива, ZipEntry - это тип переменной, который позволяет работать с элементами архива
        entry = entries.nextElement(); // отсюда пошло считывание отдельного файла
    
        Scanner s = new Scanner (zip.getInputStream(entry)); // zip - это весь архив. Здесь происходит получение данных отдельного файла
        
        
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
}