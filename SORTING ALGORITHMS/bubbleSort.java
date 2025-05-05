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

