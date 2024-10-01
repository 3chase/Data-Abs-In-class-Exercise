
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class FindSumPair
{
    public static Int[] findPair(int[] list, int Sol) {
        HashMap<Integer, Integer) map = new HashMap<>();
        
        for (int i=0; i < list.length; i++){
            int b = Sol - list[i]
            if(map.containsKey(b)){
                return [list[i], map.getValue(b)]
            }
            map.add(list[i], [i])
        }
    }
}
