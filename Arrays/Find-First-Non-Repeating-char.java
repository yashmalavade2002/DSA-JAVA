public class FirstNonRepeatingChar {
    public static char findfirstNonRepeatingChar(String str) {
       for(int i=0;i<str.length();i++){
         boolean isRepeated = false;
        for(int j=0;j<str.length();j++){
            if(i !=j && str.charAt(i) == str.charAt(j)){
                isRepeated = true;
                break;
            }
        }
        if(!isRepeated){
            return str.charAt(i);
        }
       }
       return '_';
    }
    public static void main(String[] args) {
        String input = "success";
        char result = findfirstNonRepeatingChar(input);
        System.out.println("First Non Repeating Character : "+ result);

    }
}
