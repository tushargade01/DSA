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
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next; 
        }
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
    Node removeLast(){
        Node temp = head;
        Node pre = head;
        if(length == 0){return null;}
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }
    void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
            length++;
        }
    }
    Node removeFirst(){
        Node temp = head;
        if(length == 0){
            return null;
        }else{
            head = temp.next;
            temp.next = null;
        }
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }
    Node get(int index){
        Node temp = head;
        if(index < 0 || index >= length){
            return null;
        }else{
            for(int i=0;i<index;i++){
                temp = temp.next;
            }
        }
        return temp;
    }
    boolean set(int index,int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
    boolean insert(int index, int value){
        if(index < 0 || index >= length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next =temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    Node remove(int index){

        if(index < 0 || index >= length) return null;
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;


    }
    void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i =0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
public class linkedListProgram{
    public static void main(String[] args){
        LinkedList list = new LinkedList(4);
        list.append(2);
        list.append(5);
        list.printAll();
         list.printList();
        System.out.println("removed element: "+list.removeLast().value);
        System.out.println("removed element: "+list.removeLast().value);
        

        list.prepend(6);
        list.append(5);
        list.printList();
        list.removeFirst();
        list.append(2);
        list.append(9);
        list.append(8);
        System.out.println("after append 2,9,8");
        list.printList();
        System.out.println("at 3rd index : "+list.get(3).value);
        list.set(1,6);
        list.insert(3,10);
        System.out.println("after insert");
        list.printList();
        System.out.println("remove : "+list.remove(3).value);
        list.reverse();
        list.printList();
    }
}