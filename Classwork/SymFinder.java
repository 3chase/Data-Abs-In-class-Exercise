
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class SymFinder
{
    public static void findPair(int arr[][]) {
        HashMap<Integer, Integer) hm = new HashMap<>();
        
        for (int i=0; i < arr.length; i++){
            int fir = arr[i][0];
            int sec = arr[i][1];
            Integer val = hm.get(sec);
            
            if (val != null && val == first){
                System.out.println(sec + " " + first);
            } else{
                hm.add(fir, sec);
            }
        }
    }
}
