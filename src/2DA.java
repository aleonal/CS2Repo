public class 2DA {
  public static void printnxn(int[][] array) {
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array.length; j++)
        System.out.print(array[i][j] + " ");

      System.out.println();
    }
  }
}
