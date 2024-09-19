public class CustomeQueue {

    private int[] data;
    private static final int Default_Size =  0;
    int end = 0;

    public CustomeQueue(){
        this(Default_Size);
    }

    public CustomeQueue(int size){
        this.data = new int[size];
    }

    //indserts the elemnets into queue
    public boolean offer(int value){

        if(isFull()){
            return false;
        }

        data[end++] = value;
        return true;
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    //removes elements from queue
    public int poll(){

        if(isEmpty()){
            return -1;
        }

        int removed = data[0];

        for(int i = 1; i<end; i++){
            data[i-1] = data[i];
        }

        return removed;
    }

    //remove First
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("Queue is Empty(): ");
        }

        int removed = data[0];
        data[0] = 0;

        return removed;
    }

    //remove Last
    public int removeLast(){
        if(isEmpty()){
            System.out.println("Queue is Empty(): ");
        }

        int removed = data[data.length-1];
        data[data.length-1] = 0;

        return removed;
    }

    //getFirst Elements
    public int getFirst(){

        if(isEmpty()){
            return -1;
        }

        return data[0];
    }

    public int getLast() {
        if (isEmpty()) {
            System.out.println("Queue is Empty(): ");
        }

        return data[data.length - 1];
    }
}
