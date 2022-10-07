package Basics;

public class pracitce {

    private Node head;
    private Node tail;
    private int size;

    public  class Node{

        private int value;
        private Node next;

        public Node(){

        }
        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int value){

        Node node = new Node(value);
        node.next = head;
        head = node;

        if( tail == null){
            tail = node;
        }

    }

    public void insertEnd(int value){
        // when tail is known to us
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    public void insertEndWt(int value){
        // when we don't know where tail is
        Node node = new Node(value);
        Node temp = new Node();

        while( temp.next != null ){
            temp = temp.next;
        }
        temp.next = node;

    }

    public void insertionRec(int pos, int val){

        head.next = insertRec(head,pos,val);
    }

    public Node insertRec(Node temp, int pos, int val){

        // base condition
        if( pos == 0){
            Node node = new Node(val, temp);
            size++;
            return temp;

        }
        temp.next = insertRec(temp.next,pos-1,val);
        return temp;
    }
    public void display(){
        Node temp = new Node();
        temp = head;
        while( temp != null ){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void insert(int value, int index){
        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node aux = new Node(value,temp.next);
        temp.next = aux;
    }

    public void deleteIndex(int pos){
        Node temp = new Node();
        temp = head;
        for(int i = 1; i < pos; i++){

            temp = temp.next;
        }

        temp.next = temp.next.next;

    }
}
