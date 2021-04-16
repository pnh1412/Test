public class ArrayQueue {
    protected Object[] a;
    protected int max;
    protected int first, last;
    
    public ArrayQueue(int max){
        this.max = max;
        a =new Object[max];
        first = last = -1;
    }
    public ArrayQueue(){
        this(10);
    }
    public boolean isEmpty(){
        return(first ==-1);
    }
    public boolean isFull(){
        return(first == 0 && max == -1 || first == last + 1); 
    }
}

