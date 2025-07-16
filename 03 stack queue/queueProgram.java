class Queues{
    private Node first; 
    private Node last;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    Queues(int value){
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }
    void Enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
        length++;
    }
    Node Dequeue(){
        Node temp = first;
        Node current = temp;;
        if(length == 0) return null;
        if(length == 1){
            first = null;
            last = null;
        }else{
            while(temp.next != null){
                current = temp;
                temp = temp.next;
            }
            current.next = null;
            last = current;
        }
        length--;
        return temp;
    }
    void printList(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
class queueProgram {
    public static void main(String args[]){
        Queues qs = new Queues(0);
        qs.Enqueue(1);
        qs.Enqueue(2);
        qs.Enqueue(3);
        qs.Enqueue(4);
        System.out.println(qs.Dequeue().value);
        System.out.println(qs.Dequeue().value);
        System.out.println(qs.Dequeue().value);
        System.out.println(qs.Dequeue().value);
        System.out.println(qs.Dequeue().value);
        System.out.println(qs.Dequeue());
        System.out.println("list:");
        qs.printList();
    }
}
