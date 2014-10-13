///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//LoopTheLoop java Program
import java.util.Scanner; //import scanner
public class LoopTheLoop{
                // main method 
               public static void main(String[] args) {
int nStar=10;
while (nStar>0){
    System.out.print("*");
    nStar--;

}
System.out.println(" ");
String x="*";

int nStar2=10;
while (nStar2>0){
    System.out.println(x);
    nStar2--;
    x+="*";

  }
Scanner a;//decalre
a=new Scanner(System.in);//accept input
System.out.println("Enter an int between 1 and 15- ");
String y="*";
if (a.hasNextInt()){
    nStar=a.nextInt();

    if(nStar>0&&nStar<16){
        int xx=nStar;
       while (xx>0){
    System.out.print("*");
    xx--;}
    System.out.println(" ");
         while (nStar>0){
    System.out.println(y);
    nStar--;
    y+="*";
    }}}
    else
    System.out.println("Your int was not in the range [1.15]");


                   
               }
}