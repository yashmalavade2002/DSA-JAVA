import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
      String inputstr1="Tea";
      String inputStr2 = "Eat";
      inputstr1=inputstr1.toLowerCase();
      inputStr2=inputStr2.toLowerCase();

      if (inputstr1.length()==inputStr2.length())
      {
     char[] charArray1=inputstr1.toCharArray();
     char[] charArray2=inputStr2.toCharArray();
     Arrays.sort(charArray1);
     Arrays.sort(charArray2);

     boolean result = Arrays.equals(charArray1, charArray2);
     if(result){
      System.out.println(inputstr1 + " and " +inputStr2 +" Are Anagram");
     }
     else{
      System.out.println(inputstr1 + " and " +inputStr2 +" Are Not Anagram");
     }

      }
      else {
    System.out.println(inputstr1 + " and " +inputStr2 +" Are Not Anagram");
      }


    }
}
