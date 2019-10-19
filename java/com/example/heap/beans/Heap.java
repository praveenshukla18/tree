package com.example.heap.beans;

import com.example.binarytree.beans.Node;
import com.example.completebinarytree.beans.CompleteBinaryTree;
import com.example.completebinarytree.exceptions.NodeNotValidException;

public abstract class Heap{
    private CompleteBinaryTree tree = new CompleteBinaryTree();

    public void insert(Node node) throws NodeNotValidException {
        tree.insertNode(node);
        heapify();
    }

    private void heapify(){
        heapify(tree.getRoot());
    }

    private void heapify(Node node){
        if(node != null){
            heapify(node.getLeft());
            checkChildrenAndSwap(node);
            heapify(node.getRight());
        }
    }

    protected abstract void checkChildrenAndSwap(Node node);

    protected void swap(Node node1, Node node2){
        Comparable data1 = node1.getData();
        node1.setData(node2.getData());
        node2.setData(data1);
    }

    protected Node getRoot(){
        return tree.getRoot();
    }

    public void printHeap(){
        tree.inOrderPrint();
    }

}
