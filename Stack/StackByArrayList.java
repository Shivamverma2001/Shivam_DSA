import java.util.ArrayList;

public class StackByArrayList {
    static class Stack {
        public static ArrayList<Integer> a = new ArrayList<>();

        public static boolean isEmpty() {
            return a.size() == 0;
        }

        public static void push(int data) {
            a.add(data);
        }

        public static int pop() {
            int top = a.get(a.size() - 1);
            a.remove(a.size() - 1);
            return top;
        }

        public static int peek() {
            return a.get(a.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
