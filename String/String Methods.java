public class Main {

    public static void main(String[] args) {
       // Create A string
       String str1 = "Hello";                 // Using string literal
       String str2 = new String("World");     // Using 'new' keyword
       System.out.println(str1);
       System.out.println(str2);
       
    // Length Method 
   int str = str1.length();
    System.out.println(str);
       
   // ToLowerCase()
   System.out.println(str1.toLowerCase());

   // ToUppercase()
   System.out.println(str1.toUpperCase());

   // charAt()
    
   System.out.println(str1.charAt(0));

   //Trim()
   System.out.println(str1.trim());


   // substring
   System.out.println(str1.substring(0, 2));


   // equals() && equalsIgnoreCase()
   String a = "Java";
   String b= "java";
   System.out.println(a.equals(b));
   System.out.println(a.equalsIgnoreCase(b));
      
// contains & startswith & endswith
String str = "Hello World";

System.out.println(str.contains("World"));    // true
System.out.println(str.startsWith("Hello"));  // true
System.out.println(str.endsWith("ld"));       // true


// indexOf() &&     LastIndexOf()

String str = "banana";

System.out.println(str.indexOf('a'));      // 1 (first occurrence)
System.out.println(str.lastIndexOf('a'));  // 5 (last occurrence)



// Replace
String str="Banana";
System.out.println(str.replace("Banana","Apple"));
System.out.println(str.replace('B','A' ));


    }
}
