/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.io.Serializable;

/**
 *
 * @author tubaabbasi
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Left Tree
//        BT<Double> node1 = new BT(-4.15, null, null);
//        BT<Double> node2 = new BT(0.0, null, node1);
//        BT<Double> node3 = new BT(52.3, node2, null);
        
        // Right Tree
//        BT<Double> node6 = new BT(6.93, null, null);
//        BT<Double> node7 = new BT(7.21, node6, null);
        
        // Root Node
//        BT<Double> root = new BT(-8.01,node3,node7);
        
        BT<Double> root = new BT(-8.01,new BT(52.3, new BT(0.0, null, new BT(-4.15, null, null)), null), new BT(7.21, new BT(6.93, null, null), null));
    }
}


    

    
    
    

