// Q Count Vowels , Characters and consonants in a String
public class Main {

  public static void main(String[] args) {
    String str ="we are learning java";
    int count=0; 
    int Vcount=0;
    int ccount=0;
    str = str.toLowerCase();

    for(int i=0;i<str.length();i++){
    
     if(str.charAt(i)!=' '){
      count++;
     }
     if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u' ){
      Vcount++;
     }
     else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
       ccount++;
     }
     
    }

    System.out.println("Total Number of characters in string is "+count);
    System.out.println("Total Number of Vowels in A String is "+ Vcount);
    System.out.println("Total Number of Consonants in string is "+ccount);

  }
}
