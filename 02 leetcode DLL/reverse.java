class reverseDLL{
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
    reverseDLL(int value){
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
    void reverses(){
        if(length == 0 ){System.out.println("its null");}
        if(length == 1){
            System.out.println(head.value);
        }
        Node current = head;
        Node temp = null;
        while(current!=null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        temp = head;
        head = tail;
        tail = temp;
    }
}
public class reverse {
    public static void main(String args[]){
        reverseDLL rdl = new reverseDLL(0);
        rdl.append(1);
        rdl.append(2);
        rdl.append(3);
        rdl.printall();
        rdl.reverses();
        rdl.printList();
    }
}