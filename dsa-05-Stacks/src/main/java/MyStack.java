import java.util.NoSuchElementException;

public class MyStack<T> {
    public SNode<T> bottom;
    public SNode<T> top;
    int size;

    public boolean isEmpty() {
        return bottom == null;
    }

    public void push(T item) {
        SNode<T> node = new SNode<>(item);
        if (isEmpty())
            bottom = top = node;
        else {
            top.next = node;
            top = node;
        }
        size++;
    }

    public T peak() {
        return (T) top.value;
    }

    public T pop() {
        SNode peakNode;
        if (isEmpty())
            throw new NoSuchElementException();
        // stack has one element
        if (top == bottom) {
            peakNode = top;
            top = bottom = null;
        } else { // more than one element
            peakNode = top;
            SNode prev = bottom;
            while (prev.next != top) {
                prev = prev.next;
            }
            prev.next = null;
            top = prev;
        }
        size--;
        return (T) peakNode.value;
    }

}
