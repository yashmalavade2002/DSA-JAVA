import java.util.HashSet;
import java.util.Iterator;
class Hashsets {
    public static void main(String[] args) {
        
    
    // declare hashset
    HashSet <Integer> set = new HashSet<Integer>();
     
    // add
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);



    // size
    System.out.println("size of set is "+set.size());


    // search contains
    if(set.contains(1)){
        System.out.println("set contains 1");
    }


// Delete
set.remove(1);
if(! set.contains(1)){
    System.out.println("we deleted 1");
}






// Iterator 
Iterator it = set.iterator();
// hasnext // next
while(it.hasNext()){
    System.out.println(it.next());
}

}
}
