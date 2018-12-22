public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int x) {
        Node temp = head;
        if(temp == null) {
            head = new Node(x, null);
            System.out.println("Added " + x + " to the end of the list");
            return;
        }

        while(temp.next != null)
            temp = temp.next;

        temp.next = new Node(x, null);

        System.out.println("Added " + x + " to the end of the list");
    }

    public void prepend(int x) {
        if(head == null) {
            head = new Node(x, null);
            return;
        }

        Node temp = new Node(x, head);
        head = temp;

        System.out.println("Added " + x + " to the front list");
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

    public boolean search(int x) {
        int place = 0;
        if(head == null) return false;

        Node temp = head;
        while(temp != null) {
            place++;

            if(temp.getData() == x) {
                System.out.println("The element " + x + " is in node " + place);
                return true;
            } else temp = temp.next;
        }
        System.out.println("The element " + x + " was not found");
        return false;
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