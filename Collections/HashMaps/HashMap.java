import java.util.*;
class HashMaps {
    public static void main(String[] args) {
        
    
    HashMap <String,Integer> map= new HashMap<>();

    // Insertion
    map.put("India",120);
    map.put("Japan", 30);
    map.put("Us",150);

    System.out.println(map);
          map.put("Japan", 130);

          System.out.println(map);


          // contains search
                  if(map.containsKey("Japan")){
                    System.out.println("key is present");
                  }
                  else{
                    System.out.println("not present");
                  }
              
               // Delete
                  map.remove("Us");
        System.out.println(map);

                  // get 

                  System.out.println(map.get("china"));

                  System.out.println(map.get("Us"));

         // Iterate
      for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());


        
      }
}
}
