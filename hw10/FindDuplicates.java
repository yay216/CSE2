///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//FindDuplicates java program
//adding mehtods hasDups() and exactlyOneDup(), so that the main program test if the array input by the user has duplicates and if there is only one duplicate.

import java.util.Scanner;//import scanner
public class FindDuplicates{

//main method
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);//read input
    int num[]=new int[10];//initialize a new array with size 10
    String answer="";//initial varible answer with type string
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }//give values for the array one by one from scan
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }//if return is true, add "has" after out: "The array "
      else{
        out+="does not have ";//if return is true, add "does not have "after out:"the array"
      }
      out+="duplicates.";//add "duplicates" after string out
      System.out.println(out);//print the whole string out
      out="The array ";//set out to be "the array"
      out+=listArray(num);//add the array after it    
      if(exactlyOneDup(num)){
        out+="has ";
      }//if return true, add "has"
      else{
        out+="does not have ";
      }//else add "doesn not have "
      out+="exactly one duplicate.";//add "exactly one duplicate to the string out
      System.out.println(out);//print out the whole string out
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//print out"Go again? Enter 'y' or 'Y', anything else to quit- "
      answer=scan.next();//scan input from user 
    }while(answer.equals("Y") || answer.equals("y"));// repeat the program if the user enters Y or y
  }


//method listArray
  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//list out the array from scan
  
  
  
  //method has Dups
//return true if and only if the input array has at least one repeated entry.     
  public static boolean hasDups(int x[]){
      int i=1;
      int o=9;
      boolean test=false;
         while(o>-1){
         while(i<x.length){
             if(x[0]==x[i]){
             test=true;}
             i++;//test if the first element in the array is the same as the rest.
      }
      
       int temp = x[0];
     for(int c=0;c<x.length-1;c++){
             x[c] = x[c+1];
     }
       x[9] = temp;//swap the tested value all the way to the end
            o--;
             i=1;
         }
      // test if any of the values is the same as others.
      return test;
  }    
  
  
 // method exachtlyOneDup
 //
  public static boolean exactlyOneDup(int x[]){
      int o=9;
      int i=1;
      int counts=0;
      boolean test=false;
         while(o>-1){
         while(i<x.length){
             if(x[0]==x[i]){
             counts++;}//if there is a same one, add counts by 1
             i++; 
      }// test if the first element is the same as any other
      
       int temp = x[0];
     for(int c=0;c<x.length-1;c++){
             x[c] = x[c+1];
     }
       x[9] = temp;//swap the tested value to the end of the array 
            o--;
             i=1;
         }
        
      // test if any of the values is the same as others.
      if(counts==2)//test if counts =2, since the same number will be double counted in my method
      return true;
      else
      return false;
  }    
}