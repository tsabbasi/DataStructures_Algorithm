/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetraversal;

import java.io.Serializable;

/**
 *
 * @author tubaabbasi
 * @param <E>
 */
public class BinaryTree<E> implements Serializable {
   
    /**
     *
     * @param <E>
     */
    
    public static class Node<E> {

        protected E data;
        protected Node<E> left;
        protected Node<E> right;

        public Node(E data){
            this.data = data;
            left = null;
            right = null;
        }

        @Override
        public String toString(){
            return data.toString();
        }
    }

    private Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(Node<E> root) {
        this.root = root;
        this.root.left = null;
        this.root.right = null;
    }

    public BinaryTree(E Data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        root = new Node<>(Data);
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

    private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
        if (node == null){
            // pass
        }else{
            // visit root
            sb.append(node.toString());
            sb.append(" ");
            // traverse left
            preOrderTraverse(node.left, depth + 1, sb);
            // traverse right
            preOrderTraverse(node.right, depth + 1, sb);
        }
    }
    
        private void inOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
        if (node == null){
            // pass
        }else{
            // traverse left
            inOrderTraverse(node.left, depth + 1, sb);
            // visit root
            sb.append(node.toString());
            sb.append(" ");
            // traverse right
            inOrderTraverse(node.right, depth + 1, sb);
        }
    }
    
    private void postOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
        if (node == null){
            // pass
        }else{
            // traverse left
            postOrderTraverse(node.left, depth + 1, sb);
            //traverse right
            postOrderTraverse(node.right, depth + 1, sb);
            // visit root
            sb.append(node.toString());
            sb.append(" ");
        }
    }

    
    public static void main(String[] args) {
        
        // Left Tree
        BinaryTree<String> node3 = new BinaryTree('g', null, null);
        BinaryTree<String> node2 = new BinaryTree('d', null, node3);
        
        
        BinaryTree<String> node5 = new BinaryTree('h', null, null);
        BinaryTree<String> node4 = new BinaryTree('e', node5, null);
        BinaryTree<String> node1 = new BinaryTree('b', node2, node4);
        
        // Right Tree        
        BinaryTree<String> node9 = new BinaryTree('j', null, null);
        BinaryTree<String> node8 = new BinaryTree('i', null, null);        
        BinaryTree<String> node7 = new BinaryTree('f', node8, node9);
        BinaryTree<String> node6 = new BinaryTree('c', node7, null);
            
        // Root Node
        BinaryTree<String> root = new BinaryTree('a',node1,node6);
        
        StringBuilder preOrderSb = new StringBuilder();
        
        System.out.println("Pre-order Traversal:");
        node3.preOrderTraverse(root.root, 4, preOrderSb);
        System.out.print(preOrderSb.toString());
        System.out.println("");
        
        StringBuilder inOrderSb = new StringBuilder();
        System.out.println("In-order Traversal:");
        node3.inOrderTraverse(root.root, 4, inOrderSb);
        System.out.print(inOrderSb.toString());
        System.out.println("");
        
        StringBuilder postOrderSb = new StringBuilder();
        System.out.println("Post-order Traversal:");
        node3.postOrderTraverse(root.root, 4, postOrderSb);
        System.out.print(postOrderSb.toString());
        System.out.println("");   
    } 
}
