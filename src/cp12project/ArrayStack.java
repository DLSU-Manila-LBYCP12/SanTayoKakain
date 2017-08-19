package cp12project;
public class ArrayStack<E> implements Stack<E>
{
    private final int size;
    private int top;
    private E[] elements;
    public ArrayStack()
    {
        this(4);
    }
    public ArrayStack(int s)
    {
        size=s>0?s:10;
        top=-1;
        elements=(E[])new Object[size];
    }
    public int size()
    {
        return top+1;
    }
    public void push(E x)
    {
        if(top==size-1)
            System.out.println("Overflow");
        elements[top+1]=x;
        top++;
    }
    public E pop()
    {
        if(top==-1)
            System.out.println("Underflow");
        E temp = elements[top];
        top--;
        return temp;
    }
    public E peek()
    {
        if(top==-1)
            System.out.println("Underflow");
        return elements[top];
    }

    public void display()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        else
        {
            for(int i=0;i<top;i++)
                System.out.println(elements[i]);
        }
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public E top(){
        return elements[top];
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

