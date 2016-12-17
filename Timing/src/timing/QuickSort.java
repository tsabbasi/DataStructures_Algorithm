/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timing;

/**
 *
 * @author tubaabbasi
 */
public class QuickSort {
    
    public static <T extends Comparable<T>> void sort(T[] table){
        // Sort the whole table
        quickSort(table, 0, table.length - 1);
    }
    
    private static <T extends Comparable<T>> void quickSort(T[] table, int first, int last){
        if (first < last){
            int pivIndex = partition(table, first, last);
            // Sort the left half
            quickSort(table, first, pivIndex - 1);
            // Sort the right half
            quickSort(table, pivIndex + 1, last);
        }
    }
    
    private static <T extends Comparable<T>> int partition(T[]table, int first, int last){
        
        // Select the first item as the pivot value
        T pivot = table[first];
        int up = first;
        int down = last;
        
        do {
            while ((up < last) && (pivot.compareTo(table[up]) >=0)){
                up++;
            }
            // Up equals first or table[up] > pivot
            while (pivot.compareTo(table[down]) < 0){
                down--;
            }
            // Down equals first or table[down] <= pivot
            if (up < down){
                // If up is to the left of down.
                // Exchange table[up] and table[down]
                swap(table, up, down);
            }
        }
        
        while (up < down); 
            // Repeat while up is left of down
            // Exchange table[first] and table[down] thus putting the pivot value where it belongs
            swap(table, first, down);
            // Return the index of the pivot value.
            return down;
    }
    
    public static <T extends Comparable<T>> void swap (T[] table ,int first, int last){
        T firstValue = table[first];
        table[first] = table[last];
        table[last] = firstValue;
    }
}
