package cs2.classwork;

public class AppearTwice {
    public static boolean arrayCheck(int[] a){
        boolean truth = false;
        for(int i=0; i < a.length; i++){
            for(int g=i+1; g < a.length; g++){
                if(a[i] == a[g]){
                    truth = true;
                    break;
                }
            }
        }
        return truth;
    }
    public static void main(String[] args) {
        int[] array = {1,5,2,2,3,8};
        System.out.println(arrayCheck(array));
    }
    
}
//other solutions
//array sort and check neighboring number
//set and map since no duplicates