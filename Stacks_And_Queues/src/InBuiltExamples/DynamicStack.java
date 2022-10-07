package InBuiltExamples;

public class DynamicStack extends CustomStack{

    // here we created dynamic stacks because if we at a particular time our stack size gets full then
    // it will not throw exception and create another array of size 2*originalSize  and will copy all original element into new array
    // keeping it dynamic like arrayList

    public DynamicStack(){
        super();
        // it will call the default constructor of the parent class
    }

    public DynamicStack(int size){
        super(size);
        // it will call the CustomStack(int size) constructor of parent class
    }

    public void  push(int value){

        if( isFull() ){

            // if the array size is full
            int[] arr = new int[data.length*2];
            for(int i = 0; i < data.length; i++){
                arr[i] = data[i];
            }
            data = arr;
        }

        // if the array size is not full then we can simpy put it in the original one
        // so here we can call the push method of super class
        super.push(value);
    }
}
