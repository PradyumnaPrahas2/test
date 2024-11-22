package dsa_java.labprograms;
public class MyPriorityQueue {
    int[] heap;
    int capacity;
    int size;
    public MyPriorityQueue(int capacity){
        this.capacity=capacity;
        this.size=0;
        this.heap=new int[capacity];
    }
    public void add(int ele){
        if(capacity<size){
            throw new IllegalStateException("Priority Queue is Full");
        }
        heap[size]=ele;
        size++;
        heapify_Up(size-1);
    }
    public void heapify_Up(int idx){
        int parent_idx=(idx-1)/2;
        while(idx>0 && heap[idx]>heap[parent_idx]){
            swap(idx,parent_idx);
            idx=parent_idx;
            parent_idx=(idx-1)/2;
        }
    }
    public void swap(int i1,int i2){
        int temp=heap[i1];
        heap[i1]=heap[i2];
        heap[i2]=temp;
    }
    public Object poll(){
        if(size==0){
            return null;
        }
        int root=heap[0];
        heap[0]=heap[size-1];
        size--;
        heapify_down(0);
        return root;
    }
    public void heapify_down(int idx){
        int smallest=idx;
        int left_child=2*idx+1;
        int right_child=2*idx+2;
        if(left_child<size && heap[left_child]<heap[smallest]){
            smallest=left_child;
        }
        if(right_child<size && heap[right_child]<heap[smallest]){
            smallest=right_child;
        }
        if(smallest!=idx){
            swap(smallest,idx);
            heapify_down(smallest);
        }
    }
    public Object peek(){
        if(size==0){
            return null;
        }
        return heap[0];
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
}
