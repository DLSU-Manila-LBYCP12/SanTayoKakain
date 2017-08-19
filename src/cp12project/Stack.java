package cp12project;
public interface Stack<E>
{
    /**
     * Return the number of elements in the stack.
     */
    public int size();

    /**
     * Return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Return element at the top of the stack.
     * Throws EmptyStackException if the stack is empty.
     */
    public E top();


    /**
     * Insert an element at the top of the stack.
     */
    public void push(E element);

    /**
     * Remove the top element from the stack.
     * Throws EmptyStackException if the stack is empty.
     */
    public E pop();

}