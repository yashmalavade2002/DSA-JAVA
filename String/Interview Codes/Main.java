class Main{
    public static void main(String[] args) {
        // Q1 Count consonant excluding vowels
    //   String[] arr = {"a","p","e","i","o","u","z"};
    //   int consonantcount=0;
       
    //   for(String s:arr){
    //     char ch =s.charAt(0);

    //     if(ch>='a' && ch<='z'){
    //         if( !(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u') ){
    //          consonantcount++;
    //         }
    //     }

    //   }
    //   System.out.println(consonantcount);



    // Q2 Write a program to reverse each word in a sentence

     String s ="Hello World";

     String[] word=s.split(" ");

     String rev1=new StringBuilder(word[0]).reverse().toString();
     String rev2=new StringBuilder(word[1]).reverse().toString();

     System.out.println(rev1+" "+rev2);
    
    }
}
