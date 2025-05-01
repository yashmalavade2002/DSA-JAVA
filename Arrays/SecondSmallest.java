public class SecondSmallest {

    public static int SecondSmallest(int[] array) {
        int Smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for (int n : array) {
            if (n < Smallest) {
                SecondSmallest = Smallest;
                Smallest = n;
            } else if (n < SecondSmallest && n != Smallest) {
                SecondSmallest = n;
            }
        }
        return SecondSmallest;

    }

    public static void main(String[] args) {
        int[] SampleArray = { 12, 34, 15, 6, 40 };
        int result = SecondSmallest(SampleArray);
        System.out.println("Second Smallest Element Is: " + result);
    }
}
