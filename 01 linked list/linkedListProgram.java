class LinkedList{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    void printAll(){
        System.out.println("Head: "+head.value);
        System.out.println("tail: "+tail.value);
        System.out.println("length: "+length);

        Node temp = head;
        while(temp.next != null){
            System.out.println(temp.value);
        }
    }
}
public class linkedListProgram{
    public static void main(String[] args){
        LinkedList list = new LinkedList(4);
        list.printAll();
    }
}