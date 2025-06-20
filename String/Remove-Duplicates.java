public class removeDuplicates {
    public static String RemoveDuplicates(String str) {
        String result = "";
        for(int i=0; i <str.length();i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch) == -1){
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String input ="programming";
        String output = RemoveDuplicates(input);
         System.out.println("After removing duplicates: " + output);
    }
}
