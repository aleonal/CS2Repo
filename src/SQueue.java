public class SQueue {
    Stack s1;
    Stack s2;

    public SQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int data = s2.pop();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return data;
    }

    public void print() {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        System.out.print("Printing SQueue: ");
        while(!s2.isEmpty()) {
            System.out.print(s2.peek() + " ");
            s1.push(s2.pop());
        }
        System.out.println();
    }
}
