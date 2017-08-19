package cp12project;

public class MyQueue<E>{

    private int maxSize = 100;
    private E[] queue;
    private int front;
    private int rear;
    private int nItems;

    public MyQueue()
    {
        queue = (E[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(E j)
    {
        if (rear == maxSize - 1)
        rear = -1;
        queue[++rear] = j;
        nItems++;
    }

    public void dequeue() {
        nItems--;
        front++;
    }

    public void clear(){
        for(int i=0; i<size(); i++){
            dequeue();
            nItems = 0;
        }
    }

    public E peek()
    {
        return queue[rear];
    }

    public int size()
    {
        return nItems;
    }

        public E Front(){
        return queue[front];
    }
}