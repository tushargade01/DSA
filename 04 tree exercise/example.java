class BinarySearchTree{
    public Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value = value;
        }
    }
    boolean insert(int value){
        Node newNode = new Node(value);
        Node temp = root;
        if(root == null){
            root = newNode;
            return true;
        }else{
            while(true){
                if(newNode.value < temp.value){
                    if(temp.left == null){
                        temp.left = newNode;
                        return true;
                    }else{
                        temp = temp.left;
                    }
                }
                else if(newNode.value > temp.value){
                    //code
                    if(temp.right == null){
                        temp.right = newNode;
                        return true;
                    }else{
                        temp = temp.right;
                    }
                }else{
                    return false;
                }
            }
        }
        
    }
    boolean contains(int value){
        //if(root == null) return false;
        Node temp = root;
        while(temp != null){
            //if(temp.value == value) return true;
            if(temp.value < value){
                temp = temp.right;
            }else if(temp.value > value){
                temp = temp.left;
            }else{
                return true;
            }
        }
        return false;
    }
    Node getRoot(){
        return root;
    }
}
public class example {
    public static void main(String[] args){
        BinarySearchTree bst = new BinarySearchTree();
        //System.out.println(bst.getRoot());
        bst.insert(25);
        //System.out.println(bst.getRoot().value);
        bst.insert(15);
        bst.insert(10);
        bst.insert(18);
        bst.insert(35);
        //System.out.println(bst.root.right.value);
        System.out.println(bst.contains(11));
    }    
}
