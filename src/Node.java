public class Node<Type> {
    Type data=null;
    Node<Type> next=null;

    Node(Type data,Node<Type> next){
        this.data=data;
        this.next=next;
    }
}
