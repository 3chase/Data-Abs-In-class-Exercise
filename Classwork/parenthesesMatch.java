package cs2.classwork;
import java.util.Stack;
public class parenthesesMatch {
    public static void main(String[] args) {
        Boolean ok = isValid("({}()[{}])");
        System.out.println(ok);
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        if(s.length() % 2 == 0){
            for(int i=0; i < s.length(); i++){
                if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                }
                else{
                    if(s.charAt(i) == ')'){
                        if(stack.pop() != '('){
                            return false;
                        }
                    }
                    if(s.charAt(i) == '}'){
                        if(stack.pop() != '{'){
                            return false;
                        }
                    }
                    if(s.charAt(i) == ']'){
                        if(stack.pop() != '['){
                            return false;
                        }
                    }   
                }  
            }
            if(stack.isEmpty() == true){
                return true;
            }  
        } 
        return false;
            
    }
}
