class swapPairs{
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
    swapPairs(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
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
    void swapPair(){
       Node dummynode = new Node(0);
       dummynode.next = head;
       Node previousNode = dummynode;
       while(head != null && head.next != null){
            Node firstNode = head;
            Node secondNode = head.next;

            previousNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            secondNode.prev = previousNode;
            firstNode.prev = secondNode;

            if(firstNode.next != null){
                firstNode.next.prev = firstNode;
            }

            head = firstNode.next;
            previousNode = firstNode;
       }
       head = dummynode.next;
       if(head != null) head.prev = null;
    }

}

public class swapNodePairs {
    public static void main(String[] args){
        swapPairs pc = new swapPairs(1);
        pc.append(2);
        pc.append(3);
        pc.append(4);
        pc.swapPair();
        pc.printList();
        pc.printall();
        
    }
}
