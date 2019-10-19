package com.example.heap.beans;

import com.example.binarytree.beans.Node;

public class MinHeap extends Heap implements com.example.heap.api.MinHeap {

    protected void checkChildrenAndSwap(Node node) {
        if(node.getLeft() != null){
            if(node.getLeft().compareTo(node) < 0){
                swap(node,node.getLeft());
            }
        }
        if(node.getRight() != null){
            if(node.getRight().compareTo(node) < 0){
                swap(node,node.getRight());
            }
        }
    }

    public Node extractMin() {
        return null;
    }

    public Node getMin() {
        return null;
    }
}
