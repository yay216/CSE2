///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//FourDigiits Java Program
//By inputting a double and print out its four digits after the decimal
import java.util.Scanner;
//define a class
public class FourDigits {
    //mainthod
     public static void main(String[] args){
    Scanner input;
    input=new Scanner(System.in );
System.out.print("Enter a double and I display the four digits to the right of the decimal point- "); 
    double x= input.nextDouble();
    int xx=(int)(x)*10000;//get rid of the digits after the decimal and make the number somthing like xxxx000000.
    int xxx=(int)(x*10000);//make the number within the same scientific figures with xx.
    int xxxx=xxx-xx;//get the digits after the decimal.
    int xxxxx=xxxx%10000;//get the first four digits.
System.out.print("The four digits are "+xxxxx);//print out the result.
     }
    //end of method
}//end of class