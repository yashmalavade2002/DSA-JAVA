import java.util.*;
public class Main {

    public static void main(String[] args) {
        
   // Arrays 
   // syntax
//    type[]arrayName= new Type[size];

// Declaration Methods
 int marks [] = new int[3];
  int [] marks = new int[3];
int [] marks = {97,98,90};


  marks[0]=97; // phy
  marks[1]=98; // chem
  marks[2]=90; //eng
  System.out.println(marks[0]);
  System.out.println(marks[1]);
  System.out.println(marks[2]);

for(int i=0;i<3;i++){
    System.out.println(marks[i]);
}


// Assignment 1
// Take An array as input from user . search for a given number x and print the index at which it occurs
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int numbers[]=new int[size];

// input
for(int i=0;i<size;i++){
    numbers[i]=sc.nextInt();
}

int x= sc.nextInt();

// output
for(int i=0;i<size;i++){
    if(numbers[i]==x){
        System.out.println("Number found at index "+i);
    }
}



    }
}
