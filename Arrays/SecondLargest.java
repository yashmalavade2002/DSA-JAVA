public class SecondLargest {

    public static int findSecondLargest(int[] array) {
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int n : array) {
            if (n > largest) {
                secondLargest = largest;
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] sampleArray = { 12, 34, 15, 6, 40 };
        int result = findSecondLargest(sampleArray);
        System.out.println("Second Largest Element is " + result);
    }
}
