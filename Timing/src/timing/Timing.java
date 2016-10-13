/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timing;

import java.sql.Time;
import java.util.*;
//import java.lang.Integer;

/**
 *
 * @author tubaabbasi
 */
public class Timing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter array size:");
        int size = keyboard.nextInt();
        
        System.out.println("Size: " + size);
        
        Integer [] items = new Integer[size];
        
        Random rInt = new Random();
        
        for (int i = 0; i < items.length; i++) {
            items [i] = rInt.nextInt();
            System.out.println(items[i]);
        }
        
        System.out.println("Before Sorting");
        
        
        long startTime = System.currentTimeMillis();
        
        BubbleSort.sort(items);
        
        System.out.println("After Sorting");
        for (int i = 0; i < items.length; i++) {
            
            System.out.println(items[i]);
        }
        
        System.out.println("Time-difference: " + (System.currentTimeMillis() - startTime) + "ms");

    }
    
}
