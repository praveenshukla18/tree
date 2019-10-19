package com.example.app;

import com.example.completebinarytree.exceptions.NodeNotValidException;
import com.example.heap.beans.MaxHeap;
import com.example.binarytree.beans.Node;


public class App {

    public static void main(String[] args){

        MaxHeap tree = new MaxHeap();

        try {

            tree.insert(new Node<Integer>(10));
            tree.insert(new Node<Integer>(7));
            tree.insert(new Node<Integer>(5));
            tree.insert(new Node<Integer>(4));

            tree.printHeap();
            System.out.println();
            System.out.println("Root(Max Element): "+tree.getMax().getData());
            System.out.println("_________________________________");

            tree.insert(new Node<Integer>(12));

            tree.printHeap();
            System.out.println();
            System.out.println("Root(Max Element)"+tree.getMax().getData());

        } catch (NodeNotValidException e) {
            System.out.println("invalid node encountered while inserting");
            e.printStackTrace();
        }

    }
}
