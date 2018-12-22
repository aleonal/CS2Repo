public class Stack {
    Node head;

    public void push(int x) {
        Node temp = head;
        if(temp == null) {
            head = new Node(x, null);
            return;
        }

        while(temp.next != null) temp = temp.next;
        temp.next = new Node(x, null);
    }

    public int pop() {
        Node temp = head;
        if(temp == null) return Integer.MIN_VALUE;
        if(temp.next == null) {
            int data = temp.getData();
            head = null;
            return data;
        }

        while(temp.next.next != null) temp = temp.next;

        int data = temp.next.getData();
        temp.next = null;
        return data;
    }

    public int peek() {
        Node temp = head;
        if(temp == null) return Integer.MIN_VALUE;
        while(temp.next != null) temp = temp.next;

        return temp.getData();
    }

    public boolean isEmpty() {
        return head == null;
    }
}

