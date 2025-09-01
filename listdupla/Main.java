public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.append(10);
        list.append(20);
        list.append(30);

        list.printForward();   // Esperado: 10 20 30
        list.printBackward();  // Esperado: 30 20 10

        list.prepend(5);
        list.printForward();   // Esperado: 5 10 20 30

        list.remove(20);
        list.printForward();   // Esperado: 5 10 30
        list.printBackward();  // Esperado: 30 10 5
    }
}