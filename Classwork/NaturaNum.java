package cs2.classwork;

public class NaturaNum {
    public static int fiveSeven(int a){
        int sum = 0;
        for(int b = 0; b<a; b++){
            if(b%5 == 0 || b%7 ==0){
                sum += b;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fiveSeven(20));
    }
    
}
