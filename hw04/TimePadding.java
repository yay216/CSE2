///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//TimePadding Java Program
//by inputting the seconds that have passed to display the conventional time of the day.


import java.util.Scanner; // import scanner

//define class as IncomeTax
public class TimePadding{
    
//main method    
public static void main(String[] args) {
    
    
Scanner myScanner; //declare

myScanner= new Scanner( System.in ); // myScanner gets input from Scanner
System.out.print("Enter the time in seconds: "); //ask for the time in seconds.

int x=myScanner.nextInt(); //Set x as the value of input 

int hour=(int)(x/3600); //calculate hour by the remainder function
int min=(int)((x-hour*3600)/60);//calculate min by the remainder function
int sec=x-hour*3600-min*60;//calculate sec 

if(min<10){
    if (sec<10){
        System.out.println("The time is "+hour+":"+"0"+min+":"+"0"+sec);//print when min and sec only have one digit
        }
    else{
        System.out.println("The time is "+hour+":"+"0"+min+":"+sec);//print when min has only one digit
    }
    }
else{
    if(sec<10){
        System.out.println("The time is "+hour+":"+min+":"+"0"+":"+sec); //print when sec only has one digit
    }
    else{
        System.out.println("The time is "+hour+":"+min+":"+sec);//print when 
    }
    
}




    
}//end of main method
}//end of class