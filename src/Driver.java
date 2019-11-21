public class Driver {

    public static DequeADT<Integer> deque = new JavaDeque<>();

    public static void main(String[] args){
        System.out.println(deque.isEmpty());
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        deque.addFirst(2);
        deque.addLast(33);
        System.out.println(deque.first());
        System.out.println(deque.last());
        System.out.println(deque.isEmpty());
    }

}
