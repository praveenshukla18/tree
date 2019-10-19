package com.example.completebinarytree.beans;

import com.example.binarytree.beans.Node;
import com.example.completebinarytree.exceptions.NodeNotValidException;

import java.util.LinkedList;

public class CompleteBinaryTree {

    private Node root;

    public CompleteBinaryTree() {

    }

    public CompleteBinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insertNode(Node node) throws NodeNotValidException {
        if(node == null){
            throw new NodeNotValidException("The Node being inserted is either null or have children");
        }
        if(node.getLeft()!= null || node.getRight() != null){
            throw new NodeNotValidException("The Node being inserted is either null or have children");
        }
        LinkedList<Node> bfsQueue = new LinkedList<Node>();
        if(root == null){
            root = node;
            return;
        }
        bfsQueue.add(root);
        Node intermediateNode;
        while(true){
            intermediateNode = bfsQueue.remove();
            if(intermediateNode.getLeft() == null){
                intermediateNode.setLeft(node);
                break;
            }
            if(intermediateNode.getRight() == null){
                intermediateNode.setRight(node);
                break;
            }
            bfsQueue.add(intermediateNode.getLeft());
            bfsQueue.add(intermediateNode.getRight());
        }
    }

    public void inOrderPrint() {
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.print(node.getData()+" ");
            inOrder(node.getRight());
        }
    }
}
