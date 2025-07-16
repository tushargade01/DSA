import java.util.*;
class arrayListStack<T>{
    private ArrayList<T> stacks;
    arrayListStack(){
        stacks = new ArrayList<T>();
    }
    
    void push(T value){
        stacks.add(value);
    }
    void printList(){
        for(int i = stacks.size()-1;i>=0;i--){
            System.out.println(stacks.get(i));
        }
    }
    T pop(){
        if(stacks.size() == 0) return null;
        return stacks.remove(stacks.size()-1);
    }
}

public class stackImplementation {
    public static void main(String[] args){
        arrayListStack<Integer> ars = new arrayListStack<Integer>();
        ars.push(9);
        ars.push(2);
        System.out.println(ars.pop());
        ars.printList();
    }
}
