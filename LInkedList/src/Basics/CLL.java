package Basics;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public class Node{

        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(){

        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }

    public Node after(int after){
        Node temp = head;

        while( temp.next != head ){

            if( temp.value == after){
                return temp;
            }

            temp = temp.next;
        }
        return null;
    }

    public void insertAfter(int value,int after){

        Node temp = after(after);

        if( temp == null ){
            System.out.println("Value does not exist");
            return;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;

        size++;


    }

    public void insertLast(int value){

        Node node = new Node(value);

        if( head == null ){
            head = node;
            tail = node;
        }

        node.next = tail.next;
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertFirst(int value){

        Node node = new Node(value);
        if( head == null ){
            head = node;
            tail = node;
        }

        node.next = head;
        tail.next = node;
        head = node;
        size++;

    }

    public void display(){
        Node temp = head;

        do {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }while( temp != head);

        System.out.print("END");
    }

    public void delete(int value){
        Node temp = head;

        if( temp == null ){
            return;
        }
        // our head is the value that we want to delete
        if (temp.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = temp.next;
            if( n.value == value ){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while( temp != head);


    }

}
