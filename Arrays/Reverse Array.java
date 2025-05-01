// Q WAP To Reverse Array In-Place
public class Main {

  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 50 };
    // before reverse
    System.out.print(" BEFORE REVERSE: ");
    for (int val : array) {
      System.out.print(val + " ");
    }

    // reverse array ka logic
    int First = 0;
    int Last = array.length - 1;
    while (Last > First) {
      int temp = array[First]; // temp =>10
      array[First] = array[Last]; // first => 50
      array[Last] = temp; // last => 10

      First++;
      Last--;
    }

    // After reverse
    System.out.print("\n AFTER REVERSE: ");
    for (int val : array) {
      System.out.print(val + " ");
    }

  }
}
