import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
     // Arraylist
      ArrayList<Integer> list = new ArrayList<>();
      
      // Add elements
      list.add(0);
      list.add(2);
      list.add(3);
      System.out.println(list);


      // Get elements
      int element =list.get(1);
      System.out.println(element);

      // add element in between
      list.add(1,1);
      System.out.println(list);

      // set element
      list.set(0, 5);
      System.out.println(list);

      // delete element
      list.remove(3);
      System.out.println(list);

      // size 
      int size = list.size();
      System.out.println(size);

      // loops
      for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
      }
      System.out.println();


      // sorting
     Collections.sort(list);
     System.out.println(list);
    }
}


import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
     // Arraylist
      ArrayList<Integer> l1 = new ArrayList<>();
       // add new elements
       l1.add(5);
       l1.add(6);
       l1.add(7);
       l1.add(8);
       // get an element at index i
       System.out.println(l1.get(1)); // 6

       // print with loop
      //  for(int i=0;i<l1.size();i++){
      //   System.out.println(l1.get(i));
      //  }

       // printing arraylist directly
       System.out.println(l1);

       // adding element at index i
       l1.add(1,100);
       System.out.println(l1);

       // modifying element at index i
       l1.set(1, 10);
       System.out.println(l1);


       // removing element at index i
       l1.remove(1);
       System.out.println(l1);

       // removing element e
       l1.remove(Integer.valueOf(8));
       System.out.println(l1);


       // checking if an element exist
       boolean ans=l1.contains(Integer.valueOf(7));
       System.out.println( ans);


       


    }
}
