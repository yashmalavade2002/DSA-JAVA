
public class Main {

    public static void main(String[] args) {
      // Count Total No of Characters in A String
      String str ="Hello Yash";
      int count=0;
      for(int i=0;i<str.length();i++){ 
        if(str.charAt(i)!=' '){
          count++;
        }
      }
      System.out.println("Number of characters in a string is "+count);

    }
}
