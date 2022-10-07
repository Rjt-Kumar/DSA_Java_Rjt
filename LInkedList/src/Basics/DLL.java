package Basics;

public class DLL {

      private  Node head;
      private Node tail;
      private int size;

      public class Node{

            int value;
            Node next;
            Node previous;

            public Node(int value){
                  this.value = value;
            }

            public Node(int value,Node next){
                  this.value = value;
                  this.next = next;
            }

            public Node(int value,Node next,Node previous){
                  this.value = value;
                  this.next = next;
                  this.previous = previous;
            }

      }

      public void insertFirst(int value){

            Node node = new Node(value);

            if( head == null ){
                  head = node;
                  size++;
                  return;
            }

            node.next = head;
            head.previous = node;
            head = node;
            node.previous = null;
            size++;

      }

      public void display(){
            Node temp = head;

            while( temp != null){
                  System.out.print(temp.value + " -> ");
                  tail = temp;
                  temp = temp.next;
            }
            System.out.print("END");
      }

      public void displayRev(){

            Node temp = tail;

            while( temp != null ){

                  System.out.print(temp.value+" -> ");
                  tail = temp;
                  temp = temp.next;


            }
            System.out.println("START");
      }

      public void insert(int value, int  pos){
            Node node = new Node(value);

            if( pos == 0){
                  insertFirst(value);
                  return;
            }

            if( pos == size-1){
                  insertLast(value);
                  return;
            }
            Node temp = head;

            for(int i =1 ; i < pos; i++){

                  temp = temp.next;
            }
            node.next = temp.next;
            node.previous = temp;
            if( temp.next == null ){


            }

      }

      public void insertLast(int value){

            Node node = new Node(value);

            tail.next = node;
            node.next = null;
            node.previous = tail;
            tail = node;
            size++;
      }

      public Node find(int after){

            Node temp = head;

            while( temp != null ){

                  if( temp.value == after ){
                        return temp;
                  }
                  temp = temp.next;
            }

            return null;
      }

      public void insertAfter(int after , int value){

            Node temp = find(after);

            if( temp == null ){
                  System.out.println("Value does not exist");
                  return;
            }

            Node node = new Node(value);

            node.next = temp.next;
            temp.next = node;
            node.previous = temp;

            if( node.next == null){
                  return;
            }
            node.next.previous = node;

      }

}
