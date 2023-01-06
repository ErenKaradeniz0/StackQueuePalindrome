
public interface IStack<Type> {
    public boolean isEmpty();

    public void push(Type item);

    public Type pop();

    public Type top();
}