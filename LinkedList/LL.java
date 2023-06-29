import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.addFirst("a");
        l.addFirst("is");
        l.addFirst("This");
        l.addLast("Singly Linked List");
        System.out.println(l);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i) + "->");
        }
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}
