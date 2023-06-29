public class SinglyLinkedList {
    Node head;
    private int size;

    SinglyLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            size++;
        }
    }

    public void addFirst(String data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.print("Linked List is empty");
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void deleteFirst() {
        head = head.next;
        size--;
        return;
    }

    public void deleteLast() {
        size--;
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public int getSize() {
        return size;
    }

    public void reverse() {
        if (head == null || head.next == null)
            return;
        Node prev = head;
        Node cur = head.next;
        while (cur != null) {
            Node next = cur.next;
            cur.next = prev;
            // update
            prev = cur;
            cur = next;
        }
        head.next = null;
        head = prev;
    }

    public Node recursiveReverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.addLast("Singly Linked List");
        System.out.println(ll.getSize());
        ll.print();
        System.out.println();
        ll.deleteFirst();
        ll.print();
        System.out.println();
        ll.deleteLast();
        ll.print();
        System.out.println(ll.getSize());
        ll.reverse();
        ll.print();
        ll.head = ll.recursiveReverse(ll.head);
        ll.print();
    }
}
