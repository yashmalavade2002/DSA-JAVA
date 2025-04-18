public class ReverseExample {
	public static void main(String[] args) {
		String str = "yash";
		String revString = new StringBuilder(str).reverse().toString();
		System.out.println("Reverse String : " + revString);
	}
}
