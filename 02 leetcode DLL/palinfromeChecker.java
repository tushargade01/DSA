class palindromeCheck{
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
    palindromeCheck(int value){
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
    boolean isPalindrome(){
        for(int i=0;i<length/2;i++){
            int in = head.value;
            int out = tail.value;
            if(in != out){return false;}
            head = head.next;
            tail = tail.prev;
        }
        return true;
    }
}

public class palinfromeChecker {
    public static void main(String[] args){
        palindromeCheck pc = new palindromeCheck(1);
        pc.append(2);
        pc.append(3);
        pc.append(4);
        pc.append(2);
        pc.append(1);
        pc.printList();
        pc.printall();
        System.out.println(pc.isPalindrome());
    }
}
