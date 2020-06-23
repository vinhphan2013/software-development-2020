package com.data.structure.practice;

public class TreeRunner {
    public static void main(String args[]) {
        NodeInsertionBST tree = new NodeInsertionBST(5);

        tree.insert(4);
        tree.insert(8);
        tree.insert(12);
        tree.insert(15);
        tree.insert(19);


        tree.printInOrder();
        System.out.println(tree.contains(19));

    }
}
