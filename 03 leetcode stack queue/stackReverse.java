import java.util.*;

public class stackReverse {
    public static String reverseString(String string) {
        Stack stack = new Stack<>();
        String reversedString = "";
    
        for (char c : string.toCharArray()) {
            stack.push(c);
        }
        
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
    
        return reversedString;
    }
    public static void main(String args[]){
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);
    }
}
