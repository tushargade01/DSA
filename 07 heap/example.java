  /*
            EXPECTED OUTPUT:
            ----------------
            [99, 72, 61, 58]
            [100, 99, 61, 58, 72]
            [100, 99, 75, 58, 72, 61]

        */
import java.util.*;
class Heap{
    private List<Integer> heap;

    Heap(){
        this.heap = new ArrayList<>();
    }
    private int leftChild(int index){
        return 2*index + 1; 
    }
    private int rightChild(int index){
        return 2*index + 2;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
    void getHeap(){
        System.out.println(heap);
    }
    void insert(int value){
        heap.add(value);
        int current = heap.size()-1;
        while(current>0 && heap.get(current)>heap.get(parent(current))){
            swap(current,parent(current));
            current = parent(current);
        }
    }
    void sinkDown(int index){
        int maxValue = index;
        while (true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if(leftIndex<heap.size() && heap.get(leftIndex)>heap.get(maxValue)){
                maxValue = leftIndex;
            }
            if(rightIndex<heap.size() && heap.get(rightIndex)>heap.get(maxValue)){
                maxValue = rightIndex;
            }
            if(maxValue!=index){
                swap(index, maxValue);
                index = maxValue;
            }else{
                return; 
            }
        }
    }
    int remove(){
        if(heap.size()==0) return 0;
        if(heap.size() == 1) return heap.remove(0);

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDown(0);
        return maxValue;
    }

}
public class example{
    public static void main(String[] args){
        Heap hp = new Heap();
        hp.insert(99);
        hp.insert(72);
        hp.insert(61);
        hp.insert(58);
        hp.getHeap();
        hp.insert(100);
        hp.getHeap();
        hp.insert(75);
        // hp.getHeap();
        // hp.remove();
        // hp.remove();
        hp.getHeap();
    }
}