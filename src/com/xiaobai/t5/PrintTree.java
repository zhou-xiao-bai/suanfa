package com.xiaobai.t5;

import java.util.LinkedList;

/**
 * @author 江湖人称白玉汤
 * @program 剑指Offer
 * @description 遍历二叉树的方式（层级遍历，前序，中序，后序）
 * @create 2020-04-29 19:14
 **/
public class PrintTree {

    static class TreeNode {
        Object data;
        TreeNode parent;
        TreeNode leftChild;
        TreeNode rightChild;
        TreeNode(Object data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        TreeNode tree = new TreeNode("A");
        tree.leftChild =new TreeNode("B");
        tree.rightChild =new TreeNode("C");
        tree.leftChild.leftChild = new TreeNode("D");
        tree.leftChild.rightChild = new TreeNode("F");
        tree.leftChild.rightChild.leftChild = new TreeNode("E");
        tree.rightChild.leftChild = new TreeNode("G");
        tree.rightChild.leftChild.rightChild = new TreeNode("H");
        tree.rightChild.rightChild = new TreeNode("I");
        preOrderTraversal(tree);
        System.out.println();
        inOrderTraversal(tree);
        System.out.println();
        postOrderTraversal(tree);
        System.out.println();
        levelOrder(tree);
    }
    //先序遍历 根->左->右
    public static void preOrderTraversal(TreeNode node) {
        if (node==null) return;
        System.out.print(node.data + " ");
        if (node.leftChild!=null) preOrderTraversal(node.leftChild);
        if (node.rightChild!=null) preOrderTraversal(node.rightChild);
    }
    //中序遍历 左->根->右
    public static void inOrderTraversal(TreeNode node) {
        if (node==null) return;
        if (node.leftChild!=null) inOrderTraversal(node.leftChild);
        System.out.print(node.data + " ");
        if (node.rightChild!=null) inOrderTraversal(node.rightChild);
    }
    //后序遍历 左->右->中
    public static void postOrderTraversal(TreeNode node) {
        if (node==null) return;
        if (node.leftChild!=null) postOrderTraversal(node.leftChild);
        if (node.rightChild!=null) postOrderTraversal(node.rightChild);
        System.out.print(node.data + " ");
    }
    //层级遍历(使用队列)
    public static void levelOrder(TreeNode node) {
        if (node==null) return;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        TreeNode root = node;
        while (!queue.isEmpty()) {
            root = queue.pop();
            System.out.print(root.data + " ");
            if (root.leftChild!=null) queue.add(root.leftChild);
            if (root.rightChild!=null) queue.add(root.rightChild);
        }
    }

}
