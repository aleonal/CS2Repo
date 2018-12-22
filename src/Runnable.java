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
    
  }
}
