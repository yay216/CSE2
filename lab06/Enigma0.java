/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    int n=0; //initailize here so the error wont come up on line 29
    if(scan.hasNextInt()){
     n=scan.nextInt();  //since n is already initialized in the outer scope
      System.out.println("You entered "+n);
    }
    else{
      n=4; 
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;// no need of intialize n again
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      
      //deleted because we need to print the following line also 
        System.out.println("Again, you entered "+n); //wrong words
      break; //a break is needed here also
    }
  }
}

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 */

