
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Node{
    
}
public int height(Node node){
    if(node == null){
        return 0;
    } else {
        int lH = height(node.left);
        int rH = height(node.right);
        return Math.max(lH,rH) + 1;
    }
}

public int balanceFactor(Node node){
    return height(node.right) - height(node.left);
}
public Node rotateLeft(Node node){
    Node rightChild = node.right;
    node.right = rightChild.left;
    rightChild.left = node;
    return rightChild;
}
public Node rotateRight(Node node){
    Node leftChild = node.left;
    node.left = leftChild.right;
    leftChild.right = node;
    return leftChild;
}