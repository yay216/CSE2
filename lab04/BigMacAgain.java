///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//BigMacAgain Java Program
//By inputting the number of bigmacs, print out the corresponding cost, or print out error if you are not inputting an integer. Then enter Y/y/N/n to order fires or not. Finally print out the total cost.
import java.util.Scanner;
// define a class
public class BigMacAgain{
                // main method 
               public static void main(String[] args) {
Scanner myScanner;//decalre


double bc;
double ac;
double xx;
myScanner = new Scanner( System.in );
System.out.print("Enter the number of BigMacs: "); 


if(myScanner.hasNextInt()){
int x= myScanner.nextInt();


if (x>0){
ac=(int)(x*222);
bc=ac/100;

 
  System.out.println("You ordered "+x+" Big Macs for a cost of "+x+"x2.22"+" = "+bc);
}
else{System.out.println("You did not enter an int > 0");
  return;} 
    }

else{
  System.out.println("You did not enter an int");
  return;    //leaves the program
}





myScanner = new Scanner( System.in );
System.out.print("Do you want an order of fries (Y/y/N/n)? "); 

String answer=myScanner.next();
    
if(answer.equals("Y")){
  xx=2.15;
  System.out.print("You ordered fries at a cost of $2.15");}

if(answer.equals("y")){
  xx=2.15;
  System.out.print("You ordered fries at a cost of $2.15");}
else if(answer.equals("N")){
  xx=0;}
else if(answer.equals("n")){
  xx=0;}
else{
  System.out.println("You did not enter Y/y/N/n");
  return;    //leaves the program, i.e.
                //the program terminates
}

double totalcost=bc+xx;

System.out.println("The total cost of the meal is "+totalcost);


}  //end of main method   
      } //end of class
