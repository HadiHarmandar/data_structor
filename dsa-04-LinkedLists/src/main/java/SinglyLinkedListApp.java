public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();
        myList.deleteById(9);
        myList.printNodes();


    }
}
