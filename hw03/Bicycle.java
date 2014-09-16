///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//Bicycle Java Program
//By inputting number of counts and seconds to calculate and output the distance in miles and time in minutes as well as the average speed in mph

import java.util.Scanner;
//define a class
public class Bicycle {
    //mainthod
     public static void main(String[] args){
    Scanner input;
    input=new Scanner(System.in );
    System.out.print("Enter the number of seconds "); 
    int seconds= input.nextInt();//let the reader input the time in seconds as an integer.
    System.out.print("Enter the number of counts ");
    int counts=input.nextInt();//let the reader input the counts as an integer.

    double distance=(int)(2.08/1561*counts*100)/100.0;

    double time=(int)(seconds/6)/10.0;
    double mph=(int)(distance/time*15.67/2.08*8*100)/100.0;
    System.out.println("The distance was "+distance+" miles and took "+time+" minutes");
    System.out.println("The average mph was "+mph);
}//end of main method
}//end of class
