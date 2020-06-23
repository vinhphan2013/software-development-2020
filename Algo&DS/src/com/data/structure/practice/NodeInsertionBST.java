package com.data.structure.practice;


public class NodeInsertionBST {
     /*
    Tree - Tree has root node and child node
    A binary tree - each node has no more than 2 child nodes.
    Each node has a left node and right node. One or both of those could be null
    A binary search tree (BST) - A binary tree. On any subtree, the left node are less than the root node, which less than
    all right nodes.

                                o
                               / \
                              o   o
                             /\   /\
                            o  o  o o

       Balance vs Unbalanced tree

     */

    NodeInsertionBST left, right;
    int data;
    public NodeInsertionBST(int data) {
        this.data = data;
    }

    public void insert(int value) {

        if(value < data) { //GO TO left side
            if(left == null){
                left = new NodeInsertionBST(value); //If left tree is null
            } else {
                left.insert(value);
            }
        }else{//GO TO right side
            if(right == null){
                right = new NodeInsertionBST(value); //If left tree is null
            } else {
                right.insert(value);
            }
        }
    }


    public boolean contains(int value) {
       if(value == data) { //test it against the root
           return true;
       } else if(value < data) {
           if(left == null) {
               return false;
           } else {
               return left.contains(value);
           }
       } else {
           if(right == null) {
               return false;
           } else {
               return right.contains(value);
           }
       }
    }


    public void printInOrder() {
        if(left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        System.out.println(data);
        if(left != null) {
            left.printInOrder();
        }
        if(right != null) {
            right.printInOrder();
        }
    }

    public void printPostOrder() {

        if(left != null) {
            left.printInOrder();
        }
        if(right != null) {
            right.printInOrder();
        }
        System.out.println(data);
    }

}
