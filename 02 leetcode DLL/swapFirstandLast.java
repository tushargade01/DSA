class doublyLinkedList{
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    doublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    boolean append(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
        return true;
    }
    void printall(){
        System.out.println("head: "+head.value);
        System.out.println("tail: "+tail.value);
        System.out.println("length: "+length);
    }
    void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    void swapFirstLast(){
        int temp = head.value;
        if(length <= 1){
            System.out.println("Node un swapble. less than 2");
        }
        else{
            head.value = tail.value;
            tail.value = temp;
        }
    }
}
public class swapFirstandLast {
    public static void main(String args[]){
        doublyLinkedList dl = new doublyLinkedList(1);
        dl.append(2);
        dl.append(3);
        dl.append(4);
        dl.append(5);
        dl.printall();
        System.out.println("doubly linked list: ");
        dl.printList();
        System.out.println("after call swapFirstLast():");
        dl.swapFirstLast();
        dl.printList();
    }
}
