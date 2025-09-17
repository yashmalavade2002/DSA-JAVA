import java.util.ArrayList;
import java.util.Collections;
class ArrayLists{
  public static void main(String[] args) {
    // Create Arraylist
    ArrayList<Integer> list = new ArrayList<Integer>();
       // Add Elements
    list.add(1);
    list.add(2);
    list.add(3);

  //   System.out.println(list);

  //   // get elements

  //  int  element=list.get(0);
  //   System.out.println(element);


  //   // add element in between
  //   list.add(0,0);
  //   System.out.println(list);


  //   // set element // modify
  //   list.set(0, 5);
  //   System.out.println("Set element in list: "+list);


  //   // delete element
  //   list.remove(3);
  //   System.out.println(list);


  //   // size

  //   int size=list.size();
  //   System.out.println(size);
     


  //   // Loop
  //   for(int i=0;i<list.size();i++){
  //     System.err.print(list.get(i));
  //   }

  //   // sort
  //   System.out.println();
  //   Collections.sort(list);
  //   System.out.println(list);


  // ArrayList<String> fruits=new ArrayList<String>();
  // fruits.add("Apple");
  // fruits.add("Mango");
  // fruits.add("Banana");

  // System.out.println(fruits);


  // // iterate over array
  // for(String str:fruits){
  //   System.out.println(str);
  // }

  // int size=fruits.size();
  // System.out.println(size);
  // }

  // Example Q1: Print all elements in reverse order

  // for(int i=fruits.size()-1;i>=0;i--){
  //   System.out.println(fruits.get(i));
  // }


  /// Method 2
  // Collections.reverse(fruits);
  // System.out.println(fruits);



  // Find Maximum and Minimum

  // int max=Collections.max(list);
  // int min=Collections.min(list);

  //      System.out.println(max);
  //      System.out.println(min);
   


   // Method 2
   // largest element in  arraylist

  //  int max =list.get(0);

  //  for(int n:list){
  //    if(n>max){
  //     max=n;
  //    }
  //  }

  //  System.out.println(max);


  // smallest element in arraylist

int min =list.get(0);

   for(int n:list){
     if(n<min){
      min=n;
     }
   }

   System.out.println(min);

  }
}
