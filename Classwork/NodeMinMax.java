
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class NodeMinMax { //O(log n)
    node left;
    node right;
    int val;
    
    public int min(){
        node curr = root;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }
        return curr.val;
    }
    public int max(){
        node curr = root;
        while(curr != null && curr.max != null){
            curr = curr.max;
        }
        return curr.val;
    }
}