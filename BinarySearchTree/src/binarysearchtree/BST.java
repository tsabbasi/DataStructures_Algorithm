/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author tubaabbasi
 * @param <E>
 */
public class BST<E extends Comparable<E>> extends BT<E> {
    
    protected boolean addReturn;
    
    protected E deleteReturn;
    
    public boolean add(E item) {
        root = add(root, item);
        return addReturn;
    }
    
    private Node<E> add(Node<E> localRoot, E item) {
        
        if (localRoot == null) {
            addReturn = true;
            return new Node<E>(item);
            
        } else if (item.compareTo(localRoot.data) == 0) {
            addReturn = false;
            return localRoot;
            
        } else if (item.compareTo(localRoot.data) < 0) {
            localRoot.left = add(localRoot.left, item);
            return localRoot;
            
        } else {
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }
}
