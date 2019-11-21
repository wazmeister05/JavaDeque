public interface DequeADT<E> {

    int size();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
    E first();
    E last();
    boolean isEmpty();

}
