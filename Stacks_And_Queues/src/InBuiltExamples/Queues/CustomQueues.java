package InBuiltExamples.Queues;

import InBuiltExamples.StackExceptions;

public class CustomQueues {

    protected int[] data;
    private static final int default_size = 10;
    int ptr = 0;

    public CustomQueues(){
        this(default_size);
    }
    public CustomQueues(int size){
        this.data = new int[size];
    }

    public void push(int value){
        if( isFull() ){
            System.out.println("if Full cannot push");
            return;
        }
        data[ptr++] = value;
    }

    public int pop() throws StackExceptions{

        if( isEmpty() ) {
            throw new StackExceptions("Queue is empyt");
        }
        int val = data[0];
        for(int i=1; i< ptr; i++){
            data[i-1] = data[i];
        }

        data[ptr--] = 0;
        return val;
    }


    public boolean isFull(){
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }

    public static void main(String[] args) throws StackExceptions{

        CustomQueues queues = new CustomQueues(5);

        queues.push(5);
        queues.push(4);
        queues.push(3);queues.push(2);
        System.out.println(queues.pop() + " " + queues.pop());

    }
}
