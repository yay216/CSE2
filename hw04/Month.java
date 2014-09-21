///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//Month Java Program
//By inputting the month to print out the corresponding number of days in that month.

import java.util.Scanner; // import scanner

//define class as IncomeTax
public class Month{
    
//main method    
public static void main(String[] args) {
    
    
Scanner myScanner; //declare

myScanner= new Scanner( System.in ); // myScanner gets input from Scanner

System.out.print("Enter an in giving the number of the month (1-12)- ");

//test if the input is an integer
if(myScanner.hasNextInt()){
    int x= myScanner.nextInt(); //set x as the value of the input from Scanner
    if(x>0){
        if(x<13){
            if(x==1){ //identify the month
                System.out.println("The month has 31 days");//print the days
            
            }
            else if(x==2){ //identify the month
                myScanner= new Scanner( System.in ); // myScanner gets input from Scanner
                System.out.print("Enter an int giving the year ");
                    if(myScanner.hasNextInt()){
                        int xx= myScanner.nextInt();// set xx as the value of the input from Scanner
                        if(xx>0){
                            if((double)(xx)/4==(int)(xx/4)){ //test if the year is a integer multible of 4
                                System.out.println("The month has 29 days");//print the days
                            
                            }
                            else{
                                System.out.println("The month has 28 days");//print the days
                            }
                    }
                        else{
                            System.out.println("You did not enter a positive integer");
                            
                        }
            }}
            else if(x==3){ //identify the month
                System.out.println("The month has 31 days");//print the days
            }
            else if(x==4){ //identify the month
                System.out.println("The month has 30 days");//print the days
            }
            else if(x==5){ //identify the month
                System.out.println("The month has 31 days");//print the days
            }
            else if(x==6){ //identify the month
                System.out.println("The month has 30 days");//print the days
            }
            else if(x==7){ //identify the month
                System.out.println("The month has 31 days");//print the days
            }
            else if(x==8){ //identify the month
                System.out.println("The month has 31 days");//print the days
            }
            else if(x==9){ //identify the month
                System.out.println("The month has 30 days");//print the days
            }
            else if(x==10){ //identify the month
                System.out.println("The month has 30 days");//print the days
            }
            else if(x==11){ //identify the month
                System.out.println("The month has 30 days");//print the days
            }
            else{ //identify the month
                System.out.println("The month has 31 days");//print the days
            }
            
        }
    else{
         System.out.println("You did not enter an int between 1 and 12");
        }
    
    
}}
else{
    System.out.println("You did not enter an int between 1 and 12");
}

    
    
    
}//end of main method
    
}//end of class