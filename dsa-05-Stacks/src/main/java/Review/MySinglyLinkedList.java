package Review;

public class MySinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);
        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }



    void printNodes() {
        Node<T> current = head;
        while (current != null) {
            if (current.next == null) {
                System.out.println(current.id + " => null");
            } else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }
    }

    void addFirst(T data) {
        Node<T> node = new Node(data);
        if (isEmpty()) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    T removeFirst() {
        if (isEmpty()) return null;
        T result = null;
        if (head == tail) {
            result = head.id;
            head = tail = null;
        } else {
            result = head.id;
            head = head.next;
        }
        size--;
        return result;
    }



}
