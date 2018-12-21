public class Runnable {
  public static void main(String[] args) {
    //Example 1 - Given an nxn int array, print all the elements
    int[][] nxnarray = new int[5][5];
    arrays.printnxn(nxnarray);

    //Example 2 - given an nx? int array (ragged array), print all elements
    int[][] raggedarray = new int[3][];
    raggedarray[0] = new int[3];
    raggedarray[1] = new int[5];
    raggedarray[2] = new int[10];
    arrays.printragged(raggedarray);
  }
}
