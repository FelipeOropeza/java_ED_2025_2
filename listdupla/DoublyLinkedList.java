class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Inserir no final
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // Inserir no início
    public void prepend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Remover um nó com valor específico
    public void remove(int data) {
        if (head == null) return;

        Node current = head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Removendo o primeiro nó
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    // Imprimir da esquerda para a direita
    public void printForward() {
        Node current = head;
        System.out.print("Lista (esquerda → direita): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Imprimir da direita para a esquerda
    public void printBackward() {
        if (head == null) return;

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        System.out.print("Lista (direita → esquerda): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
