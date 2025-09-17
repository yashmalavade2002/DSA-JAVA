class FindRepeatedchars {
public static void main(String[] args) {
    String str="programming";
    FindRepeatingchars(str);
}
static void FindRepeatingchars(String s) {
    int[] freq = new int[256];
    for(int i=0;i<s.length();i++){
        freq[s.charAt(i)]++;
    }


    System.out.println("Repeadted characters in string is: ");
           for(int i=0;i<s.length();i++){
        if(freq[s.charAt(i)]>1){
            System.out.println(s.charAt(i));
            freq[s.charAt(i)]=0;
        }
    }

}
    
}
