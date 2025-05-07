public class LinearSearch {

    public static int LinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 25, 30, 45, 50 };
        int key = 45;
        int result = LinearSearch(arr, key);

        if (result != -1) {
            System.out.println("Key Found At Index : " + result);

        } else {
            System.out.println("Element not found in the array.");
        }

    }

}

// Algorithm
// Algorithm for Linear Search
// 1> Start
// 2> Declare an array and search element as the key.
// 3> Traverse the array until the number is found.
// 4> If the key element is found, return the index position of the array
// element
// 5> If the key element is not found, return -1
// 6> Stop.

// Time Complexity: O(n) (worst case)

// Space Complexity: O(1)
