
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class NodeBal { //O(log n)
    node left;
    node right;
    int val;
    
    public boolean balCheck(TreeNode root){
        if (root == null){
            return true;
        }
        left = height(root.left);
        right = height(root.right);
        return (Math.abs(left - right) > 1)
    }
    public int height(Node curr){
        if(curr == null){
            return 0
        }
        int leftHeight = height(curr.left);
        int rightHeight = height(curr.right);
        return Math.max(leftHeight, RightHeight) + 1;
    }
}