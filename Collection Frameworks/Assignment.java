import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
     // Arraylist
      ArrayList<Integer> l1 = new ArrayList<>();
       l1.add(10);
       l1.add(20);
       l1.add(30);
       l1.add(40);
       l1.add(50);
System.out.println("Original Arraylist "+l1);

// Method 1
// Collections.reverse(l1);

// Method 2
int size = l1.size();
for(int i=0;i<l1.size()/2;i++){
  int temp = l1.get(i);
  l1.set(i, l1.get(size - 1 - i));
  l1.set(size - 1 - i, temp);
}


       System.out.println("Reverse Arraylist "+l1);


       // sort
       Collections.sort(l1);
       System.out.println("ascending order "+l1);
       Collections.sort(l1,Collections.reverseOrder());
       System.out.println("DESC ORDER"+l1);


       


    }
}
