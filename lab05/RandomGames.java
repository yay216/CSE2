///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//RandomGames Java Program
//
import java.util.Scanner; //import scanner
// define a class
public class RandomGames{
public static void main(String[] args) {
Scanner input;
input=new Scanner(System.in);
System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
String x= input.next();
String s;
String n;
if (x.length()==1){
    switch(x){
    case "R":
    case "r":
        int Roulette=(int)(Math.random()*37+1);
        if(Roulette>1)
            System.out.println("Roulette:"+Roulette);
        else
            System.out.println("Roulette: 00");
    break;
    case "C":
    case "c":
        int die1=(int)(Math.random()*5+0.99);
        int die2=(int)(Math.random()*5+0.99);
        int sum= die1+die2;
        System.out.println(die1+"+"+die2+"="+sum);
    break;
    case "P":
    case "p":
        int suit=(int)(Math.random()*3);
        int number=(int)(Math.random()*13+0.99);
        switch(suit){
            case 0:
                s="hearts";
            break;
            case 1:
                s="dimonds";
            break;
            case 2:
                s="spades";
            break;
            default:
                s="clubs";
            break;
        }
        switch(number){
            case 11:
               n="Jack";
            break;
            case 12:
                n="Queen";
            break;
            case 13:
                 n="King";
            break;
            default:
                n=""+number;
            break;
        }
        System.out.println(n+" of "+s);
        
    
        break;
    default:
    System.out.println("'"+x+"'"+"is not one of 'R','r','C','c','P','p' ");
    break;
    }}
else
System.out.println("a single character expected");
    
}//end of main method
}//end of class