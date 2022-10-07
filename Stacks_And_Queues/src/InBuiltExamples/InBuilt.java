package InBuiltExamples;
import java.util.*;
public class InBuilt {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        // pop function returns integer type to let us know which element is removed

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();
        // queue is implemented using linkedlist in java and is an interface where as stack is a class

        queue.add(5);
        queue.add(4);
        queue.add(2);
        queue.add(453);
        queue.add(1);

        System.out.println(queue.remove() + " " + queue.peek());

    }
}
