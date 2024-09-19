public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }

    @Override
    public void push(int value) throws Exception {
        if(this.isEmpty()){
            int[] new_array = new int[data.length*2];

            for(int i = 0; i<=data.length-1; i++){
                new_array[i] = data[i];
            }
            data = new_array;
        }
        super.push(value);
    }
}
