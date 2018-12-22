public class Queue {
    Node head;

    public void enqueue(int x) {
        if(head == null) {
            head = new Node(x, null);
            return;
        }

        Node temp = head;
        while(temp.next != null) temp = temp.next;

        temp.next = new Node(x, null);
    }

    public int dequeue() {
        if(head == null) return Integer.MIN_VALUE;

        int data = head.getData();
        head = head.next;
        return data;
    }

    public void print() {
        Node temp = head;
        System.out.print("Queue: ");
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}
