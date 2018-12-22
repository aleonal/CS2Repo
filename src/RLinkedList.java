public class RLinkedList {
    Node head;

    public RLinkedList() {
        head = null;
    }

    public void add(int x) {
        head = addHelper(x, head);
        System.out.println("Recursively added " + x + " to the list");
    }

    private Node addHelper(int x, Node temp) {
        if(temp == null) return new Node(x, null);

        temp.next = addHelper(x, temp.next);
        return temp;
    }

    public void remove() {
        head = removeHelper(head);
    }

    private Node removeHelper(Node temp) {
        if(temp == null) {
            System.out.println("No elements to remove.");
            return null;
        }
        if(temp.next == null) {
            System.out.println("Removed " + temp.getData() + " from list recursively");
            return null;
        }

        temp.next = removeHelper(temp.next);
        return temp;
    }

    public void printOrdered() {
        printO(head);
    }

    private void printO(Node temp) {
        if(temp == null) {
            System.out.println();
            return;
        }

        System.out.print(temp.getData() + " ");
        printO(temp.next);
    }

    public void printBackwards() {
        printB(head);
    }

    public void printB(Node temp) {
        if (temp == null) {
            return;
        }

        printB(temp.next);
        System.out.print(temp.getData() + " ");
    }

    public int length() {
        return lengthHelper(head);
    }

    private int lengthHelper(Node temp) {
        if(temp == null) return 0;
        return lengthHelper(temp.next) + 1;
    }

    public void removeN(int x) {
        head = removeNH(x, head);
        System.out.println("Removed element " + x + " recursively");
    }

    private Node removeNH(int x, Node head) {
        if(x == 1) return head.next;
        head.next = removeNH(x - 1, head.next);
        return head;
    }
}