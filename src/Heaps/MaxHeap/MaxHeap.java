package Heaps.MaxHeap;

public class MaxHeap {
    private int[] heap;
    private int size;

    public MaxHeap(int capacity){
        heap = new int[capacity];
    }

    public boolean isFull(){
        return size == heap.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public int getChild(int index, boolean left){
        return 2*index + (left ? 1:2);
    }

    public void insert(int value){
        if(isFull())
            throw new IndexOutOfBoundsException("Heap is Full");
        heap[size] = value;
        aboveFixHeap(size);
        size++;

    }

    public int peek(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Heap is Empty.");
        return heap[0];
    }
    public int delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap Is Empty.");
        }
        int parent = getParent(index);
        int deleteValue = heap[index];

        heap[index] = heap[size-1];
        if(index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index,size-1);
        }
        else{
            aboveFixHeap(index);
        }

        size--;
        return deleteValue;

    }

    private void fixHeapBelow(int index, int lastHeapIndex){
        int childToSwap;
        while(index <= lastHeapIndex){
            int leftChild = getChild(index,true);
            int rightChild = getChild(index,false);
            if(leftChild <= lastHeapIndex){
                if(rightChild > lastHeapIndex)
                    childToSwap = leftChild;
                else
                    childToSwap = heap[leftChild] > heap[rightChild]? leftChild : rightChild;
                if(heap[index] < heap[childToSwap]){
                    int temp =heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }
                else{
                    break;
                }
                index = childToSwap;
            }
            else
                break;
        }
    }

    public void aboveFixHeap(int index){
        int newValue = heap[index];
        while(index > 0 && newValue > heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = newValue;
    }

    public void printHeap(){
        for(int i = 0;i<size;i++){
            System.out.print(heap[i]);
            System.out.print(",");
        }
        System.out.println();
    }

    public int getParent(int index){
        return (index-1)/2;
    }

}
