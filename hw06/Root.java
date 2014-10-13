///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//Root Java Program
//
import java.util.Scanner; //import scanner
// define a class
public class Root{
                // main method 
               public static void main(String[] args) {
Scanner myScanner;//decalre
myScanner=new Scanner(System.in);//accept input

System.out.print("Enter a double that is greater than zero- ");
double x=myScanner.nextDouble();
double high=x+1;
double low=0;
double middle=(x+1)/2;
double range=0.0000001*(1+x);
while((high-low)>range){
    
    if ((middle*middle)>x){
      high=middle;}
    else{
      low=middle;}
      middle=(high+low)/2;
}
System.out.println("The square root of x lies in["+low+","+high+"]");

}//end of main method
}//end of class