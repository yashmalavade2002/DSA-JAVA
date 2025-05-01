// Q WAP To Find Avg Of All elements in An Array
public class Main {

  public static void main(String[] args) {
    int[] array = { 10, 20, 30, 40, 60 };
    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }

    int count = array.length;

    double Avg = (double) sum / count;
    System.out.println("Average Of All Elements in An Array: " + Avg);

  }
}
