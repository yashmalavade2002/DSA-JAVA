// WAP To print Largest Element in The Array
// Main class
class Main {
  
	public static void main(String[] args)
	{
		// Declare Array
		int [] numbers = {2,60,90,70,30};
		int max = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		
		System.out.println("Largest Element is "+max);
	}
}
