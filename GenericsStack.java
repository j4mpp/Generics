public class GenericsStack<T> {
    private T[] stack = (T[]) new Object[10];
    private int count = 0;

    public void push(T item) {
        stack[count++] = item;
    }

    public T pop() throws StackEmptyException, StackFullException {
        if (count == 0) {
            throw new StackEmptyException();
        } else {
            T item = stack[--count];
            stack[count] = null;
            return item;
        }
    }

    public T get(int index) {
        return this.stack[index];
    }
}
