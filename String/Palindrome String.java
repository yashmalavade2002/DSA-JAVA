public class Main {

    public static void main(String[] args) {
       // Palindrome String
       String str="Madam";
       String rev="";
       for(int i=str.length()-1;i>=0;i--){
        rev = rev+str.charAt(i);
       }
       if(str.toLowerCase().equals(rev.toLowerCase())){
        System.out.println("Palindrome String");
       }
       else{
        System.out.println("Not a Palindrome String");
       }
    }
}
