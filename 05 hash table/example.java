import java.util.*;
class HashTable{
    private int size = 7;
    private Node[] dataMap;
    
    class Node{
        String key;
        int value;
        Node next;
        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    
    HashTable(){
        dataMap = new Node[size];
    }
    int hash(String key){
        int hash = 0;
        char[] keyArr = key.toCharArray();
        for(int i=0;i<keyArr.length;i++){
            int asci = keyArr[i]; 
            hash = (hash+asci*23)%dataMap.length; //23 is prime number
        }
        return hash;
    }
    void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if(dataMap[index] == null){
            dataMap[index] = newNode;
        }else{
            Node temp = dataMap[index];
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    int get(String key){
        int index = hash(key);
        if(dataMap[index]!=null){
            Node temp = dataMap[index];
            while(temp!=null){
                if(temp.key == key){
                    return temp.value;
                }
                temp = temp.next;
            }    
        }
        return 0;
    }
    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();
        for(int i=0;i<dataMap.length;i++){
            if(dataMap[i]!=null){
                Node temp = dataMap[i];
                while(temp!=null){
                    allKeys.add(temp.key);
                    temp = temp.next;
                }
            }
        }
        return allKeys;
    }
    void printTable(){
        for(int i =0;i<dataMap.length;i++){
            System.out.println(i+" : ");
            Node temp = dataMap[i];
            while(temp!=null){
                System.out.println("keys: "+temp.key+" values"+temp.value);
                temp = temp.next;
            }
        }
    }
}
public class example {
    public static void main(String[] args){
        HashTable ht = new HashTable();
        ht.set("Tushar", 1222);
        ht.set("tushar", 1334);
        ht.set("bolts", 245);
        ht.printTable();
        System.out.println(ht.get("tushar"));
        System.out.println(ht.keys());
    }
}
