package cp12project;
public class ArrayStack1<E> implements Stack<E>
{
    private final int size;
    private int top;
    private E[] elements;
    public ArrayStack1()
    {
        this(20);
    }
    public ArrayStack1(int s)
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

}

