/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR8;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;


public class Task13 {

    public static void main(String[] args) {
  
    Scanner sc = new Scanner (System.in);
    //String line = sc.nextLine();
    String line = "jijjbjjcidihddbjbcjdjhjdjijjahahdhjcfjcghcjgjgbjdcijibgjbajhdbjhjacgbdijjbdjdjhjigjjgigjahbjjihgiccaaijjajjjijjiiidfgfhgbjjdjajjfhdjajffjhbjghjijabfihbgjjibdjbcgjhjjjbdjibjhjccjjjfjicjjjdjdjjjfjhjhjffjjfbfhhfdhjdjibdjgadcajdjdajhjcijghgijjgchdjadjjdgfbibjjaaijfjcjgjdafcjbhabiggigdccjccjghjadaacffjajicfdijfacjcdfjhhigbjhhhjcbhhfcicbadjgjjddbhhfjfhgjjbbgijijcjgjjccdjifcjjcgfjjhcdhcabggfiabchjjfbbdbjjjgfcdiadcfffjjgbdjjdahhjjaijjdjfddhahjabaacdhahafghjaajchjcdjaihijjdcajhdigiaafhjiijgjfhdjijigjchbhdabacijcajjhfjfgjahffjbahfjjdjgiiahjajjdjfggihajjgjffgjjdhajjjjhcjdjbgjjdjbjjaadhdfhdijaijhaijfhibdadibjcjdfbjigjcjhaijfghbfcjfjagchjhcadjbdbbjhjgdhbjjjfjihchjahgjajgaficjjfjjdjhjjdjajaadgfbdccgjhhajicjdahcjjajjgjjjijbijigbjbaihjgiahjfhjbjjajbjcfcjcajjdjcghicdjdjgbcjijfcacjccjijjffdjigjjhjfcdhbbjhgjfhjgajjgjhdiachhjjjdajjidgbigicjdbjjhdgjihdjcjgijjdgfjgjaaghjjgddjhcfddaajjbjbiahijdajjjbfaachjgidgcjjahfdhcabdfjhjjaifhjjbbgjchjicjjcajhbbcjbgjjjabhdgjcggajhhddbgajjfjajfcccifaibagjcbfjaihdhhbdfijjf";
    String a = sc.nextLine();
    //int index = line.indexOf('-'); // находим позицию дефиса в строке
    
if (a.length() != 1) {
    System.out.print("Нужно ввести ровно один символ\n");
    System.out.print(a.length() + "\n");
    return;
}

ArrayList<Integer> List = new ArrayList <> (); 

for (int i = 0; i < line.length(); i=i+1) {
            int k = line.indexOf(a, i);
                if (i==k) {
                    List.add(k);
                    }
            
        }  
   
Collections.sort(List);
            for (int j=0; j < List.size(); j=j+1) {   
                    System.out.print(List.get(j) + " ");
    }
System.out.print("\n");


System.out.print(List.size() + "\n");
}
}


