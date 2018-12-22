public class Runnable {
  public static void main(String[] args) {
    //Example 1 - Given an nxn int array, print all the elements
    int[][] nxnarray = new int[5][5];
    arrays.printnxn(nxnarray);
    System.out.println("---");

    //Example 2 - Given an nx? int array (ragged array), print all elements
    int[][] raggedarray = new int[3][];
    raggedarray[0] = new int[3];
    raggedarray[1] = new int[5];
    raggedarray[2] = new int[10];
    arrays.printragged(raggedarray);
    System.out.println("---");

    //Example 3 - Add & print elements in a linked list
    LinkedList list = new LinkedList();
    list.add(1);
    list.add(3);
    list.add(5);
    list.print();
    System.out.println("---");

    //Example 4 - Remove last element in a list and return its value
    System.out.println("Removed " + list.remove() + " from list");
    list.print();
    System.out.println("---");

    //Example 5 - Prepend element to a list
    list.prepend(0);
    list.print();
    System.out.println("---");

    //Example 6 - Search for element in a list
    list.search(5);
    list.search(3);
    System.out.println("---");

    //Example 7 - Add & print elements in linked list recursively
    RLinkedList rlist = new RLinkedList();
    rlist.add(1);
    rlist.add(3);
    rlist.add(5);
    System.out.print("Printing list: ");
    rlist.printOrdered();
    System.out.print("Printing list backwards: ");
    rlist.printBackwards();
    System.out.println();
    System.out.println("---");

    //Example 8 - Remove last element from list
    rlist.remove();
    System.out.print("Printing list: ");
    rlist.printOrdered();
    System.out.println("---");

    //Example 9 - Calculate length of list recursively
    System.out.println("Length of list: " + rlist.length());
    System.out.println("---");

    //Example 10 - Remove nth element recursively
    rlist.add(5);
    rlist.add(4);
    System.out.print("Printing list: ");
    rlist.printOrdered();
    rlist.removeN(2);
    System.out.print("Printing list: ");
    rlist.printOrdered();
    System.out.println("---");

    //Example 11 - Push, pop, peek, isEmpty in a stack
    Stack s = new Stack();
    System.out.println("Stack is empty: " + s.isEmpty());
    s.push(1);
    System.out.println("Pushed 1");
    s.push(2);
    System.out.println("Pushed 2");
    s.push(3);
    System.out.println("Pushed 3");
    System.out.println("Stack is empty: " + s.isEmpty());
    System.out.println("Peeking: " + s.peek());
    System.out.println("Popping: " + s.pop());
    System.out.println("Peeking: " + s.peek());
    System.out.println("Popping: " + s.pop());
    System.out.println("Peeking: " + s.peek());
    System.out.println("Popping: " + s.pop());
    System.out.println("Stack is empty: " + s.isEmpty());
    System.out.println("---");

    //Example 12 - Check if string is palindrome using stack
    String str = "abba";
    System.out.println("Is " + str + " a palindrome? - " + isPalindrome(str));
    String str2 = "hello";
    System.out.println("Is " + str2 + " a palindrome? - " + isPalindrome(str2));
    System.out.println("---");

    //Example 13 - Queues
    Queue q = new Queue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.print();
    q.dequeue();
    q.print();
    q.enqueue(4);
    q.print();
    q.dequeue();
    q.print();
    System.out.println("---");

    //Example 14 - Queue implementation with 2 stacks
    SQueue k = new SQueue();
    k.enqueue(4);
    k.enqueue(7);
    k.enqueue(9);
    k.print();
    k.enqueue(8);
    k.print();
    k.dequeue();
    k.print();
    System.out.println("---");

    //Example 15 - Binary Tree
    BinaryTree bT = new BinaryTree();
    bT.insert(1);
    bT.insert(2);
    bT.insert(3);
    System.out.print("Printing tree inorder: ");
    printTree(bT.root);
    System.out.println();
    bT.insert(4);
    System.out.print("Printing tree inorder: ");
    printTree(bT.root);
    System.out.println();
    System.out.println("---");

    //Example 16 - Binary Search Tree
    BSTree bst = new BSTree();
    bst.insert(1);
    bst.insert(4);
    bst.insert(100);
    bst.insert(54);
    System.out.print("Printing tree inorder: ");
    printTree(bst.root);
  }

  public static boolean isPalindrome(String str) {
    Stack s = new Stack();
    str = str.toLowerCase();
    String nstr = "";

    for(int i = 0 ; i < str.length(); i++) {
      s.push((int)str.charAt(i));
    }

    while(!s.isEmpty()) {
      nstr += (char)s.pop();
    }

    return str.equals(nstr);
  }

  public static void printTree(BTNode root) {
    if(root == null) return;

    printTree(root.left);
    System.out.print(root.data + " ");
    printTree(root.right);
  }
}
