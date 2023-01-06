public class Queue<Type> implements IQueue {
    private Node<Type> head; //named frontPtr in slides
    private Node<Type> tail; //named backPtr in slides

    Queue(){
        head=null;
        tail=null;
    }
    public void enqueue(Object data) {
        Node<Type> node = new Node<Type>((Type) data, null);
        if (isEmpty()) { //first node
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    //remove existing item from the queue back/tail
    public Type dequeue() {
        if(isEmpty()) {//empty queue
            return null;
        }
        if(head.next == null) { //queue with a single node
            Type retVal = head.data;
            head = null;
            tail = null;
            return retVal;
        } else { //queue with more than one node
            Type retVal = head.data;
            head = head.next;
            return retVal;
        }
    }


    //peek at existing item from the queue back/tail
    public Type front() {
        if(isEmpty()) { //empty queue
            return null;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

}
