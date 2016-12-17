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
 * @param <E>
 */

//protected static class Node<E> implements Serializable {

class Node<E> implements Serializable {
    
    protected E data;
    
    protected Node<E> left;
    
    protected Node<E> right;
    
    public Node(E data) {
        
        this.data = data;
        left = null;
        right = null;
    }
    
    public String toString() {
        
        return data.toString();
    }
    
}
