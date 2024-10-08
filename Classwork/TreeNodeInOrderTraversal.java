
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.ArrayList;
import java.util.List;

class TreeNodeInOrderTraversal {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TreeTraversal {
    public List<Integer> inOrderTrav(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root, res);
        return res;
    }

    public void inOrder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return; 
        }
        inOrder(node.left, res);
        res.add(node.val);
        inOrder(node.right, res); 
    }
}

