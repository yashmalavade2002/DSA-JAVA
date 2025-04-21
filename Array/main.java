import java.util.*;
public class Main {

    public static void main(String[] args) {
 // Arrays => collection of elememts of similar data types


 // Assignment 1
//  WAP to take input an array and then print that array
//  int [] arr = new int[5];
//  Scanner sc = new Scanner(System.in);
//  System.out.println("Enter the Array");
//  for(int i=0;i<5;i++){
//     arr[i]=sc.nextInt();
//  }
//  for(int i=0;i<5;i++){
//     System.out.println(arr[i]);
//  }

 // Assignment 2
//  WAP program to print sum of all element present in array
// int [] arr = new int [5];
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Array");

// for(int i=0;i<5;i++){
//         arr[i]=sc.nextInt();
//      }

//      int sum=0;
//      for(int i=0;i<arr.length;i++){
//       sum = sum+arr[i];
//      }
//      System.out.println("Sum of all elements in Array "+sum);

// Assignment 3
//  WAP program to take marks of 5 subjects and as a ipnut of student and then print the percentage
// int [] marks = new int [5];
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Subject Marks ");

// for(int i=0;i<5;i++){
//         marks[i]=sc.nextInt();
//      }

//      int sum=0;
//      for(int i=0;i<marks.length;i++){
//       sum = sum+marks[i];
//      }
//      System.out.println("Percentage"+(sum*100)/500+"%");


// Assigment 4 
// WAP To Reverse An Array
// int[] arr = {10, 20, 30, 40, 50};

// int n = arr.length;

// // Swap elements using for loop
// for (int i = 0; i < n / 2; i++) {
//     int temp = arr[i];
//     arr[i] = arr[n - 1 - i];
//     arr[n - 1 - i] = temp;
// }

// // Print reversed array
// for (int num : arr) {
//     System.out.print(num + " ");
// }

// Assignment 5
// WAP To find out maximum  number in an array
int [] arr = {1,255,5,6,3};
int max=0;

for(int i=0;i<5;i++){
    if(max<arr[i]){
    max=arr[i];
    }

}
System.out.println(max);

    }
}
