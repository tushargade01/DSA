import java.util.*;
class Heap{
    private List<Integer> heap;
    Heap(){
        this.heap = new ArrayList<>();
    }
    private int leftChild(int index){
        return 2*index+1;
    }
    private int rightChild(int index){
        return 2*index+1;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private void swap(int index1, int index2){
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
    protected void getHeap(){
        System.out.println(heap);
    }
    void insert(int value){
        heap.add(value);
        int current = heap.size()-1;
        while(current>0 && heap.get(current)<heap.get(parent(current))){
            swap(current, parent(current));
            current = parent(current);
        }
    }
    void sinkDown(int index){
        int minIndex = index;
        while(true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if(leftIndex<heap.size() && heap.get(leftIndex)<heap.get(minIndex)){
                minIndex = leftIndex;
            }
            if(rightIndex<heap.size() && heap.get(rightIndex)<heap.get(minIndex)){
                minIndex = rightIndex;
            }
            if(minIndex!= index){
                swap(minIndex, index);
                index = minIndex;
            }else{
                return;
            }
        }

    }
    int remove(){
        if(heap.size()==0) return 0;
        if(heap.size()==1) return heap.remove(0);
        int minHeap = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDown(0);
        return minHeap;
    }

}
public class minheap {
    public static void main(String[] args){
        Heap hp = new Heap();
        // hp.insert(99);
        // hp.insert(72);
        // hp.insert(61);
        // hp.insert(58);
        // hp.getHeap();
        // hp.insert(10);
        // hp.getHeap();
        // hp.insert(75);
        // hp.getHeap();
        hp.insert(99);
        hp.insert(72);
        hp.insert(61);
        hp.insert(58);
        hp.insert(10);
        hp.insert(75);
        System.out.println(hp.remove());
        hp.getHeap();
        System.out.println(hp.remove());
        hp.getHeap();
    }    
}
