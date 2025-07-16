class Stack{
    private Node top;
    private int height;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }
    void push(int value){
        Node newNode = new Node(value);
        if(height == 0){top = newNode;}
        newNode.next = top;
        top = newNode;
        height++;
    }
    Node pop(){
        Node temp = top;
        if(height == 0){ return null;}
        top = top.next;
        temp.next = null;
        height--;
        if(height == 0){
            top = null;
        }
        return temp;
    }
    void printList(){
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
public class stackProgram {
    public static void main(String[] args){
        Stack st = new Stack(0);
        st.push(1);
        st.push(2);
        st.push(3);
        //st.pop();
        st.printList();
    }    
}
