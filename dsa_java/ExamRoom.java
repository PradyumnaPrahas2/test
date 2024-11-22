package dsa_java;
import java.util.*;
class ExamRoom {
    int n;

    Comparator<int[]> comp=new Comparator<>(){
        @Override
        public int compare(int[] a,int[] b){
            int dista=distance(a);
            int distb=distance(b);
            if(dista==distb){
                return a[0]-b[0];
            }
            return distb-dista;
        }
    };

    public PriorityQueue<int[]> maxheap=new PriorityQueue<>(comp);
    public int distance(int[] a){
        int start=a[0];
        int end=a[1];
        if(start==-1){
            return end;
        }
        if(end==n){
            return end-1-start;
        }
        return (end-start)/2;
    }
    public ExamRoom(int n) {
        this.n=n;
        maxheap.add(new int[] {-1,n});
    }
    
    public int seat() {
        int[] max_interval=maxheap.poll();
        int seat;
        if(max_interval[0]==-1){
            seat=0;
        }
        else if(max_interval[1]==n){
            seat=n-1;
        }
        else{
            seat=(max_interval[0]+max_interval[1])/2;
        }
        maxheap.add(new int[]{max_interval[0],seat});
        maxheap.add(new int[]{seat,max_interval[1]});
        return seat;
    }
    
    public void leave(int p) {
        int left=-1,right=-1;
        for(int[] interval:maxheap){
            if(interval[0]==p){
                right=interval[1];
            }
            else if(interval[1]==p){
                left=interval[0];
            }
            if(left!=-1 && right!=-1) break;
        }
        maxheap.removeIf(interval -> interval[1]==p || interval[0]==p);
        maxheap.add(new int[]{left,right});
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */