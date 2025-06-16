public class MissingNumberFinder {
    public static int FindMissingNumber(int[] arr,int N){
        int expectedSum = N*(N+1)/2;
        int actualSum = 0;
         for(int num:arr){
          actualSum += num;
         }
         return expectedSum-actualSum;
        }

         public static void main(String args[]){
            int arr[] ={1,3,4,5};
            int N = 5;
            int result = FindMissingNumber(arr,N);

         System.out.println("Missing Number Is "+result);

    }
}
