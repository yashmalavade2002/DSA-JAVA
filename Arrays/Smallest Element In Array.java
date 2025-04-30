// WAP To Print Smallest Element In Array

public class Main {

    public static void main(String[] args) {
        // Initialize Array
      int [] arr = {10,3,50,80,55};
      int min = arr[0];

      for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min = arr[i];
        }
      }
      System.out.println("Smallest Element In The Array Is "+min);

    }
}
