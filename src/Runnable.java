public class Runnable {
  public static void main(String[] args) {
    //Example 1 - Given an nxn int array, print all the elements
    int[][] nxnarray = new int[5][5];
    arrays.printnxn(nxnarray);

    //Example 2 - Given an nx? int array (ragged array), print all elements
    int[][] raggedarray = new int[3][];
    raggedarray[0] = new int[3];
    raggedarray[1] = new int[5];
    raggedarray[2] = new int[10];
    arrays.printragged(raggedarray);

    //Example 3 - Add & print elements in a linked list
    LinkedList list = new LinkedList();
    list.add(1);
    list.add(3);
    list.add(5);
    list.print();

    //Example 4 - Remove last element in a list and return its value
    System.out.println("Removed (" + list.remove() + ") from list");
    list.print();

  }
}
