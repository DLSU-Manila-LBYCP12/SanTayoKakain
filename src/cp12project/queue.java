/**
 * Created by DakilangEpal on 8/18/2016.
 */
public interface queue<E>{

    public void initializeQueue();

    public void addQueue(E item);

    public void removeQueue();

    public boolean isEmpty();

    public boolean isFull();

    public int getSize();

    public E Front();
    
    public E Rear();

}
