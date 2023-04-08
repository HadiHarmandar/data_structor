public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Node1' address is: " + node1 + "Node1's next address is: " + node1.next);
        System.out.println("Node2' address is: " + node2 + "Node2's next address is: " + node2.next);
        System.out.println("Node3' address is: " + node3 + "Node3's next address is: " + node3.next);
        System.out.println("Node4' address is: " + node4 + "Node4's next address is: " + node4.next);

        Node current;
        Node head = node1;
        current = head;
        while (current != null) {
            System.out.println("Id of node is: " + current.id);
            current = current.next;
        }


    }
}
