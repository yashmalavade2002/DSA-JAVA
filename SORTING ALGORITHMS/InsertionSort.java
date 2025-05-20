public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={25,15,30,9,99,20,26};

       for(int i=1;i<arr.length;i++){
        int temp = arr[i];
        int j=i-1;

        while (j>=0 && arr[j]>temp) {
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;
       }
     System.out.println();
     System.out.println("Sorted Array is: ");
       for (int num:arr) {
        System.out.print(num+" ");
       }

    }
}


// Complexity
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)


// Algorithm

// InsertionSort(A, n)
// 1. for i = 1 to n - 1 do
// 2.     key = A[i]
// 3.     j = i - 1
// 4.     while j >= 0 and A[j] > key do
// 5.         A[j + 1] = A[j]   // Shift element to the right
// 6.         j = j - 1
// 7.     A[j + 1] = key         // Insert the key into the correct position
