package com.test.tucm.algorithm.practice;

/**
 * 自定义树结构
 */
public class Node<T> {


    public T data;        //此节点，数据类型为Node
    public Node<T> left;        //此节点的左子节点，数据类型为Node
    public Node<T> right;       //此节点的右子节点，数据类型为Node

    public T getNode() {
        return data;
    }

    public void setNode(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

}
