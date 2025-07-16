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
    void printall(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    boolean append(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            newNode = head;
            newNode = tail;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
        return true;
    }
    boolean prepend(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            newNode = head;
            newNode = tail;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
        return true;
    }
    Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }else if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
        return temp;
    }
    Node removeLast(){
        Node temp = tail;
        if(length == 0){
            return null;
        }else if(length == 1){
            head = null; tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }
    Node get(int index){
        Node before = head;
        Node after = tail;
        if(index < 0 || index >= length){return null;}
        if(index > length/2){
            for(int i = length-1;i>index;i--){
                after = after.prev;
            }
            return after;
        }else{
            for(int i=0;i<index;i++){
                before = before.next;
            }
            return before;
        }
    }
    boolean set(int index, int value){
        Node prev = get(index-1);
        Node temp = prev.next;
        while (prev != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.next = after;
        newNode.prev = before;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }
    boolean remove(int index){
        if(index < 0 || index > length) return false;
        if(index == 0){
            removeFirst();
            return true;
        }
        if(index == length){
            removeLast();
            return true;
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        return true;
    }
}
public class doublyLL {
    public static void main(String args[]){
        doublyLinkedList dll = new doublyLinkedList(0);
        dll.append(3);
        dll.prepend(7);
        // System.out.println(dll.removeFirst().value);
        // System.out.println(dll.removeFirst().value);
        // System.out.println(dll.removeFirst().value);
        // System.out.println(dll.removeFirst());
        //System.out.println("removed element: "+dll.removeLast().value);
        //System.out.println("at 0 element: "+dll.get(0).value);
        dll.set(1, 6);
        dll.insert(0, 5);
        dll.remove(2);
        dll.printall();
    }    
}
