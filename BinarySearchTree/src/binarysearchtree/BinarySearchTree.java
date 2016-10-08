/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author tubaabbasi
 */
public class BinarySearchTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BST<Integer> myTree = new BST();
        
        // Left subtree
        myTree.add(99);
        myTree.add(80);
        myTree.add(77);
        myTree.add(76);
        myTree.add(94);
        myTree.add(91);
        
        // Right subtree
        myTree.add(121);
        myTree.add(118);
        myTree.add(116);
        myTree.add(125);
        myTree.add(123);
        
    }
    
}
