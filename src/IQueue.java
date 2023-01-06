public interface IQueue<Type> {
    //add new item at the queue front/head
    public void enqueue(Type data);

    //remove existing item from the queue back/tail
    public Type dequeue();

    //peek at existing item from the queue back/tail
    public Type front(); //does modify the queue!

    //check if queue is empty
    public boolean isEmpty();
}
