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
        return 2*index+2;
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
        while(heap.size()>0 && heap.get(current)>heap.get(parent(current))){
            swap(current, parent(current));
            current  = parent(current);
        }
    }
    void sinkDow(int index){
        int maxValue =index;
        while(true){
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if(leftIndex<heap.size() && heap.get(leftIndex)>heap.get(index)){
                maxValue = leftIndex;
            }
            if(rightIndex<heap.size() && heap.get(rightIndex)>heap.get(index)){
                maxValue = rightIndex;
            }
            if(maxValue!=index){
                swap(maxValue, index);
                index = maxValue;
            }else{
                return;
            }
        }
    }
    int remove(){
        if(heap.size()==0) return 0;
        if(heap.size()==1) return heap.remove(0);

        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size()-1));
        sinkDow(0);
        return maxValue;
    }
    int lengths(){
        return heap.size();
    }
    
}
public class findKthSmallest {
    public static int findKthSmallest(int[] nums, int k){
        Heap heaps= new Heap();
        for(int i : nums){
            heaps.insert(i);
            if(heaps.lengths()>k){
                heaps.remove();
            }
        }
        return heaps.remove();
    }
    public static void main(String[] args){
        int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
        
        System.out.println(findKthSmallest(nums3, 3));
        
    }
}
