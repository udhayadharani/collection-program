package Com.ModelEx;

public class LinkedList1 {
    Node head;

    class Node {
        Node(int value) {
            data = value;
            next=null;
        }
        int data;
        Node next;
    }
    LinkedList1() {
        head = null;
    }
        public void addFirst(int value){
            Node newNode= new Node(value);
            if(head==null)
                head=newNode;

               else{
                    newNode.next=head;
                    head=newNode;
                }

            }
        }


