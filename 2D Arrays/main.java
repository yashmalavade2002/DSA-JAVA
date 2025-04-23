import java.util.*;
public class Main {

    public static void main(String[] args) {
        
   // 2D Arrays

//    syntax 
//    type [][] ArrayName = new type  [rows][columns];

// input
Scanner sc = new Scanner(System.in);
int rows = sc.nextInt();
int cols= sc.nextInt();


// Define Array
int [][] numbers = new int [rows][cols];

// rows
for(int i=0;i<rows;i++){
    // cols
    for(int j=0;j<cols;j++){
numbers[i][j]=sc.nextInt();
    }
}


// output
//rows
for(int i=0;i<rows;i++){
    // cols
    for(int j=0;j<cols;j++){
           System.out.print(numbers[i][j]+" ");
        
    }
    System.out.println();
   
}

    }
}
