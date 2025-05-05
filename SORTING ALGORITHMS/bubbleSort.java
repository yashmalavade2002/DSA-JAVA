// Bubble Sort
// Bubble Sort is the simplest sortting algorithm that works by repeatedly swapping adjacent elements if they are in wrong order
public class BubbleSort {
public static void main(String[] args) {
    int arr[] = {5,1,4,2,8};
int length = arr.length;
System.out.print("UnSorted Array ");
for(int i=0;i<length;i++){
    System.out.print(arr[i] +" ");
}

for(int i=0;i<length;i++){
    for(int j=1;j<length-i;j++){
        if (arr[j-1]>arr[j]) {
            int temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
        }
    }
}
System.out.println();
System.out.print("Sorted Array ");
for(int i=0;i<length;i++){
    System.out.print(arr[i] +" ");
}

}
    
}
// Complexity
// Time Complexity: O(n^2)
// Auxiliary Space: O(1)

// Algorithm

// 1. Start:

// 2.Input: Take an array of n elements.

// 3.Print the unsorted array:

// 4. Loop through the array and print each element.

// 5. Perform Bubble Sort:

// Repeat the following steps n times for each element:

// Loop through the array from index 0 to n - i - 1 (where i is the current outer loop index).

// Compare each adjacent element arr[j - 1] and arr[j].

// 6. If arr[j - 1] > arr[j], swap them.

// 7. After each pass, the largest element gets placed at the end of the array.

// 8. Print the sorted array:

// 9. Loop through the array and print each element.

// 10. End.

