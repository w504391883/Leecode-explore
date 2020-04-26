package binarytree;

import binarytree.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

//给定一个二叉树，返回它的 前序 遍历。
//
//        示例:
//
//        输入: [1,null,2,3]
//        1
//        \
//          2
//        /
//       3
//
//        输出: [1,2,3]
//        进阶: 递归算法很简单，你可以通过迭代算法完成吗？
public class PreorderTraversal {
    private  List list = new ArrayList();

    /**
     * 递归算法   按照根-左-右的思路遍历
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    /**
     * 迭代算法实现
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalTwo(TreeNode root) {
       // 目前还未实现，等待stackCard探索完毕实现
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
