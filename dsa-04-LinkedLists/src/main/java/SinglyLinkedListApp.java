public class SinglyLinkedListApp {

    public static void main(String[] args) {

        MySinglyLinkedList myList = new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        myList.printNodes();
        System.out.println("------------------------------------------");
        System.out.println("kth item from the last: " + myList.getKthItemFromLast(1));
        myList.removeKthItemFromLast(1);
        myList.printNodes();
        myList.deleteById(9);
        myList.printNodes();

        System.out.println("index of 8: " + myList.indexOf(8));
        System.out.println("index of 0: " + myList.indexOf(0));
        System.out.println("index of 3: " + myList.indexOf(3));

        myList.addFirst(-1);
        myList.printNodes();
        System.out.println(myList.getKthItemFromLast(3));
        myList.removeKthItemFromLast(3);
        myList.printNodes();


    }
}
