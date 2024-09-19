public class CustomStack {
    //internal array % default_size for stack implementation
    protected int[] data;
    private static final int Default_Size = 10;

    //pointer points to the current/recently inserted item the stack array
    int ptr =  -1;

    //Default Constructor
    public CustomStack(){
        //this->KeyWord Calls a another Constructor
        this(Default_Size);
    }

    //initializing the internal array with deafult user input size as it is of fixe_size
    public CustomStack(int size){
        this.data = new int[size];
    }

    //push the elements into the stack array
    public void push(int value) throws Exception{
        //Checking if stack is already full if yeilds true throws exception
        if(isFull()){
            throw new Exception("can't push into the stack, the stack is full");
        }
        //pushing value into the stack & incrementing the pointer
        ptr++;
        data[ptr] = value;
    }
    //if pointer at last index stack is full
    public boolean isFull(){
        return ptr == data.length-1;
    }
    // stack pop custom method
    public int pop() throws Exception{
        //checking if stack is empty
        if(isEmpty()){
            throw new Exception("Can not be poped the stack is Empty()");
        }
        return data[ptr--];
    }
    //if pointer is set to -1 stack is Empty
    public boolean isEmpty(){
        return ptr == -1;
    }
    //peek() method implementation
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Can not be peeked from an Empty() Stack");
        }
        return data[ptr];
    }
}
