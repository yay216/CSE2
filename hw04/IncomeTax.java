///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//IncomeTax Java Program

import java.util.Scanner; // import scanner

//define class as IncomeTax
public class IncomeTax{
    
//main method    
public static void main(String[] args) {
    
    
Scanner myScanner; //declare

myScanner= new Scanner( System.in ); // myScanner gets input from Scanner
System.out.print("Enter an int giving the number of thousands- "); //print out the statement that 'Enter an int giving the number of thousands-'

//test if the input is an integer
if(myScanner.hasNextInt()){
int x= myScanner.nextInt(); //set x as the value of the input from Scanner

// test if the integer is positive
    if (x>0){
        
        //determine the range that x lies in.
        if (x<20){
            int h=(int)(x*1000*0.05*100);
            double tax=h/100;// calculate the corrsponding tax
            System.out.println("The tax rate on $"+x+",000 is 5.0%, and the tax is $"+tax);//print the tax and tax rate
            }
        else if(x<40){
            int h=(int)(x*1000*0.07*100);
            double tax=h/100;// calculate the corrsponding tax
            System.out.println("The tax rate on $"+x+",000 is 7.0%, and the tax is $"+tax);//print the tax and tax rate
            }
        else if(x<78){
            int h=(int)(x*1000*0.12*100);
            double tax=h/100;// calculate the corrsponding tax
            System.out.println("The tax rate on $"+x+",000 is 12.0%, and the tax is $"+tax);//print the tax and tax rate
        }
        else{
            int h=(int)(x*1000*0.14*100);
            double tax=h/100;// calculate the corrsponding tax
            System.out.println("The tax rate on $"+x+",000 is 14.0%, and the tax is $"+tax);//print the tax and tax rate
        }
        }
    
    else{
        System.out.println("You did not enter a positive int");//print out when we have a int that is not positive 
        
    }
}
else{
    System.out.println("You did not enter an int");    //print out when hte input is not an integer
}
    
}//end of main method
}//end of class