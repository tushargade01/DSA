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
    void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    Node findKthFromEnd(int k){
        Node fast = head;
        Node slow = head;
        for(int i=0;i<k;i++){
            if(fast ==null){
                return null;
            }
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
   
}
class findKthNodeFromEnd{
    public static void main(String args[]){
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        System.out.println(list.findKthFromEnd(4).value);
        list.printList();
        
    }
}