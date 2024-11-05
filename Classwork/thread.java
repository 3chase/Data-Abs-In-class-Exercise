
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.List;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        List<Integer> SharedList = new ArrayList<>();
        Thread thread1 = new Thread(() -> {
            for(int i = 0; i<1000; i++){
                SharedListadd(i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i<500; i++){
                SharedListadd(i);
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
