package com.example.binarytree.beans;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
    private T data;
    private Node left;
    private Node right;

    public Node(T data) {
        this.data = data;
    }

    public Node(T data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int compareTo(Node<T> o) {
        return data.compareTo(o.getData());
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
