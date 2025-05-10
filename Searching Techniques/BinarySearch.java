// PREREQUEST:-Array must be sorted....
   //    In binary search the array is divided into to parts and check whether the mid element match the key if yes then return key,
      // if the mis is less than key then start=mid+1 else if the condition is mid greater than key so, end=mid-1 it will continue untill we get key
public class search {
    public static void main(String[] args) {
        int [] arr={2,4,6,8,10,12,14};
        int target=10;
      int ans=  Bsearch(arr,target);
      System.out.println(ans);

    } 
    static int Bsearch(int[] arr,int target) {
     int start=0;
     int end=arr.length-1;
     while (start<=end) {
        int mid=(start+end)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        else if(target>arr[mid])
        {
            start=mid+1;
        }
          else if(target<arr[mid])
        {
            end=mid-1;
        }
        else{
            return mid;
        }
     }
     return -1; // if element not found then return -1
    }
}

// public class BinarySearch {
//     public static int binarySearch(int[] arr, int target) {
//         int start = 0, end = arr.length - 1;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (arr[mid] == target)
//                 return mid;
//             else if (arr[mid] < target)
//                 start = mid + 1;
//             else
//                 end = mid - 1;
//         }

//         return -1; // Not found
//     }

//     public static void main(String[] args) {
//         int[] arr = {2, 4, 10, 15, 18, 21, 30};
//         int target = 15;

//         int index = binarySearch(arr, target);

//         if (index != -1)
//             System.out.println("Found at index: " + index);
//         else
//             System.out.println("Not found");
//     }
// }


// Algorithm
// 1. Start  
// 2. Take input: a sorted array and a target value  
// 3. Initialize: start = 0, end = array.length - 1  
// 4. Repeat until start <= end:  
//    4.1. mid = (start + end) / 2  
//    4.2. If array[mid] == target → return mid  
//    4.3. If array[mid] < target → start = mid + 1  
//    4.4. If array[mid] > target → end = mid - 1  
// 5. If target is not found → return -1  
// 6. Exit  


// | Case  | Complexity |
// | ----- | ---------- |
// | Time  | O(log n)   |
// | Space | O(1)       |



