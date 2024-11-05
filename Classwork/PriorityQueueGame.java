
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/


class PriorityQueueGame {
    public int[] numberGame(int[] arr){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] res = new int[arr.length()];
        for(int num : arr){
            queue.add(num);
        }
        while(!queue.isEmpty()){
            int alice = queue.remove();
            int bob = queue.remove();
            res[index] = bob;
            index++;
            res[index] = alice;
            index++;
        }
    }
}
