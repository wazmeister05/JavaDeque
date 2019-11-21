import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class JavaDeque<E> implements DequeADT<E> {

    private List<E> deque;

    public JavaDeque(){
        deque = new ArrayList<>();
    }

    @Override
    public int size() {
        return deque.size();
    }

    @Override
    public void addFirst(E e) {
        deque.add(0,e);         //Add element to start
    }

    @Override
    public void addLast(E e) {
        deque.add(e);               //ArrayList by default with this version adds element to end.
    }

    @Override
    public E removeFirst() {
        if(deque.isEmpty()){
            throw new NoSuchElementException("Empty");
        }
        return deque.remove(0);
    }

    @Override
    public E removeLast() {
        if(deque.isEmpty()){
            throw new NoSuchElementException("Empty");
        };
        return deque.remove(size() - 1);
    }

    @Override
    public E first() {
        return deque.get(0);
    }

    @Override
    public E last() {
        return deque.get(size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
