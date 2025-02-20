/*
 * A GenericStack class with push() and pop() methods
 * @author Lukas Hecher
 * @version 2025-02-20
 */
public class GenericsStack<T> {
    private T[] stack = (T[]) new Object[10]; // Java does not allow direct type assignment for a generic array // cast from Object[] to T[]
    private int count = 0;

    /**
     * Pushes an item onto the stack.
     * @param item The item to be added to the stack.
     * @throws StackFullException If the stack is full.
     */
    public void push(T item) throws StackFullException {
        if (count == 10) {
            throw new StackFullException();
        } else {
            stack[count++] = item; // First, the item is added, then count is incremented.
        }
    }

    /**
     * Removes and returns the top item from the stack.
     * @return The last item pushed onto the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (count == 0) {
            throw new StackEmptyException();
        } else {
            T item = stack[--count]; // First, count is decremented, then the item is retrieved.
            stack[count] = null;
            return item;
        }
    }

    /**
     * Retrieves an item at a specific index without removing it.
     * @param index The index of the item.
     * @return The item at the specified index.
     */
    public T get(int index) {
        return this.stack[index];
    }
}
