public class Queue<Type> implements IQueue<Type> {
    private Node<Type> head; //named frontPtr in slides
    private Node<Type> tail; //named backPtr in slides

    Queue(){
        head=null;
        tail=null;
    }
    public void enqueue(Type data) {
        Node<Type> node = new Node<>(data, null);
        if (isEmpty()) { //first node
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    //remove existing item from the queue back/tail
    public Type dequeue() {
        if(isEmpty()) {//empty queue
            return null;
        }
        Type retVal = head.data;
        if(head.next == null) { //queue with a single node
            head = null;
            tail = null;
        } else { //queue with more than one node
            head = head.next;
        }
        return retVal;
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
