package Basics;

public class Main {

    public static void main(String[] args) {

        LL list = new LL();

        list.insertionFirst(6);
        list.insertionFirst(5);
        list.insertionFirst(4);
        list.insertionFirst(3);
        list.insertionFirst(2);
        list.insertionFirst(7);
        list.insertLast(8);
        list.insertLast(9);
        list.insertLast(10);

        list.insertLast(1);
        list.delete(1);

        list.display();

        list.bubbleSort();
        System.out.println("After bubble sort");
        list.display();
    }
}
