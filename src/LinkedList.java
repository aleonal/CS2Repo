public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int x) {
        Node temp = head;
        if(temp == null) {
            head = new Node(x, null);
            return;
        }

        while(temp.next != null)
            temp = temp.next;

        temp.next = new Node(x, null);
    }

    public int remove() {
        Node temp = head;
        if(temp == null)
            return Integer.MIN_VALUE;

        if(temp.next == null) {
            int data = temp.getData();
            head = null;
            return data;
        }

        while(temp.next.next != null)
            temp = temp.next;

        int data = temp.next.getData();
        temp.next = null;
        return data;
    }

    public void print() {
        Node temp = head;
        System.out.print("List: ");
        while(temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    private int data;
    public Node next;

    public Node(int x, Node ref) {
        data = x;
        next = ref;
    }

    public int getData() {
        return data;
    }
}