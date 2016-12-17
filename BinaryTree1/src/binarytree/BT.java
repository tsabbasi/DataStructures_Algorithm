/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.io.*;
/**
 *
 * @author tubaabbasi
 */
public class BT<E> implements Serializable {
    
    protected Node<E> root;
    
    public BT() {
        root = null;
    }
    
    protected BT(Node<E> root) {
        
        this.root = root;
    }
    
    public BT(E data, BT<E> leftTree, BT<E> rightTree) {
        
        root = new Node<E>(data);
        
        if (leftTree != null) {
            root.left = leftTree.root;
        
        } else {
            root.left = null;
        }
        
        if (rightTree != null) {
            
            root.right = rightTree.root;
            
        } else {
            root.right = null;
        }
    }
    
}


