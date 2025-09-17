class NonRepeatedChars {
    public static void main(String[] args) {
        String str="success";

        FindNonrepeatingchars(str);
       }

     static void FindNonrepeatingchars(String s) {
        int[] freq=new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
       

        System.out.println("Non Repeating chacters in string is: ");
         for(int i=0;i<s.length();i++){
           if(freq[s.charAt(i)]==1){
           System.out.println(s.charAt(i));
           }
        }

        

       }
}
