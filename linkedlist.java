class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class linkedlist {

    Node head = null;

    public void add(int data) {

        Node newNode = new Node(data);
        Node temp = head;

        if (head == null) {
            head = newNode;
        } else {

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    public void delete(int data) {

        Node temp = head;

        // delete first node
        if (head.data == data) {
            head = head.next;
            return;
        }

        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Data not found");
        } else {

            Node crr = temp.next;

            temp.next = crr.next;   // FIX

            crr.next = null;
        }
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();

        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.display();

        ll.delete(30);

        ll.display();
    }
}