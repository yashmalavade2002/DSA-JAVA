public class SelectionSort {
    // Selection Sort
    public static void main(String[] args) {
        int arr[] = { 64, 25, 12, 22, 11 };
        int length = arr.length;
        System.out.print("Unsorted Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for (int i = 0; i < length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min_index] > arr[j])
                    min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
        System.out.println();
        System.out.print("Sorted Array: ");
        for(int i=0;i<length;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
}
// Complexity
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)


// Algorithm
// Step 1: Array arr with N size
// Step 2: Initialise i=0 
// Step 3: If(i<N-1) Check for any element arr[j] where j>i and arr[j]<arr[i] then Swap arr[i] and arr[j]
// Step 4: i=i+1 and Goto Step 3
// Step 5: Exit
