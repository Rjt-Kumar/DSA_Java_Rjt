package Basics;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

   public class Node{

       private int value;
       private Node next;

       public Node(int value){
           this.value = value;
       }

       public Node(int value, Node next){
           this.value = value;
           this.next = next;
       }
       public Node(){

       }
   }

   public void insertionFirst(int value){

          Node node = new Node(value);
          node.next = head;
          head = node;     // here we are inserting element in the first index therefore
                             // head should be pointed towards it

        if( tail == null){   // if tail is equal to null i.e it is the last position
            tail = node;     // therefore tail also points towards it it would be like
        }                      /*
                                            5 head will be here only as well as tail will also be here

                                 */
        size++;
   }

   public void insertRec(int pos, int val){
        // we have to make another function as we cannot directly use node in main class
        head = insertRec(head,pos,val);
   }

   public Node insertRec(Node node, int pos, int val){
        // if we have reached the required index then create inserting node and point it towards the current node
        if( pos == 0){
         Node temp = new Node(val,node);
         size++;
         return temp;
        }

        node.next = insertRec(node.next,pos-1,val);
        return node;

   }
   public void display(){
        Node temp = new Node();  //  here we didn't use head cause
        temp = head;             // it will rearrage the structure of ll as head should always points towards
               // the first index

        while( temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
       System.out.println("END");
   }

   // inserting in the last index
   // this is the method when tail is known to us
    public void insertLast(int value){

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    // this is the method when tail is not given to us
    public void insertLastWT(int value){

        Node node = new Node(value);
        Node temp = new Node();

        temp = head;

        while( temp.next != null ){

                temp = temp.next;

        }
        temp.next = node;
        tail = node;
        size++;
         // now after this temp will be at the last position

    }

    public void insert(int value, int pos){

        if( pos == 0){
            insertionFirst(value);
            return;
        }
        if( pos == size-1 ){
            insertLast(value);
            return;
        }
        Node temp = head;

        for(int i = 1; i < pos; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;

        size++;
    }

    // DELETION

    public void deleteFirst(){

        if( head.next == null){
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        size--;
    }

    // GET function

    public Node get(int index){
        // it returns the reference variable at that index
        Node temp = head;

        if( index >= size){
            return null;
        }
        for(int i = 0; i < index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void deleteLast(){

        Node secondLast = get(size-2);
        secondLast.next = null;
        tail = secondLast;
        size--;
    }

    public void delete(int index){

        if( index >= size ){
            System.out.println("Index greater than size");
            return;
        }

        if( index == 0){
            deleteFirst();
            return;
        }

        Node temp = get(index-1);

        temp.next = temp.next.next;
        size--;

    }

    // it returns the reference variable to the node that has the given value

  public Node find(int value){
        Node temp = head;

        for(int i = 0; i < size; i++){

            if( temp.value == value ){
                return temp;
            }
            temp = temp.next;
        }
        return null;
  }

  public void bubbleSort(){
        bubble(size-1,0);
  }

  public void bubble(int row, int col ){

        if( row == 0 ){
            return;
        }

        if( col < row){

            Node first = get(col);
            Node second = get(col+1);

          if( first.value > second.value) {
              if (first == head) {
                  head = second;
                  first.next = second.next;
                  second.next = first;
              } else if (second == tail) {
                  Node prev = get(col - 1);
                  tail = first;
                  prev.next = second;
                  second.next = first;
                  first.next = null;
              } else {
                  Node prev = get(col - 1);
                  prev.next = second;
                  first.next = second.next;
                  second.next = first;
              }
          }
          bubble(row,col+1);

        }else{
            bubble(row-1,0);
        }
  }
}
