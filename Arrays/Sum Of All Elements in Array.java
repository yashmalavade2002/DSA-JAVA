// WAP To Add Sum of Elements in Array 

public class Main {

    public static void main(String[] args) {
        // Initialize Array
      int [] arr = {1,2,3,4,5};
      int sum =0;
      for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
      }
      System.out.println("Sum Of All Elements Present in Array is "+sum);
      
}
}
