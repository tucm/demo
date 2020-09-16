package com.test.tucm.base.tree;


public class TreeTest {
    public static void main(String[] args) {
        Node<String> node = new Node<>();


    }

    public void add(String root, String left, String right) {
        Node<String> node = new Node<>();
        node.setNode(root);
        Node<String> leftnode = new Node<>();
        //m
    }

//    /**
//     * addRight: 增加左子节点
//     *
//     * @param value void  返回类型
//     */
//    public void addLeft(T value) {
//        TreeNode<T> leftChild = new TreeNode<T>(value);
//        this.left = leftChild;
//    }
//
//    /**
//     * addRight: 增加右子节点
//     *
//     * @param value void  返回类型
//     */
//    public void addRight(String value) {
//        TreeNode<T> rightChild = new TreeNode<T>(value);
//        this.right = rightChild;
//    }

    // 先序遍历
    public static void preOrderTraverse(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrderTraverse(node.left);
        preOrderTraverse(node.right);
    }

    // 中序遍历
    public static void inOrderTraverse(Node node) {
        if (node == null)
            return;
        inOrderTraverse(node.left);
        System.out.print(node.data + " ");
        inOrderTraverse(node.right);
    }

    // 后序遍历
    public static void postOrderTraverse(Node node) {
        if (node == null)
            return;
        postOrderTraverse(node.left);
        postOrderTraverse(node.right);
        System.out.print(node.data + " ");
    }
}
