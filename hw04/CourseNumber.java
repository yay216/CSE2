///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//CourseNumber Java Program
//by inputting course number to print out the corresponding semester .

import java.util.Scanner; // import scanner

//define class as IncomeTax
public class CourseNumber{
    
//main method    
public static void main(String[] args) {
    
    
Scanner myScanner; //declare

myScanner= new Scanner( System.in ); // myScanner gets input from Scanner
System.out.print("Enter a six digit number giving the course semester- "); //print out the statement that 'Enter an int giving the number of thousands-'

int x=myScanner. nextInt();//define x as the the value of input

if(186510<=x&&x<=201440){ //determine whether the number is within range
    int xx=x%100; //extract the last 2 digits of course number
    if(xx==10){ //if the digits = 10
        int xxx=x/100; //extract the first four digits, which is the year
        System.out.println("The course was offered in the "+"Spring"+" semester of "+xxx);//print the semester and year
}
    
    else if (xx==20){ //if the digits = 20
        int xxx=x/100; //extract the first four digits, which is the year
        System.out.println("The course was offered in the "+"Summer 1"+" semester of "+xxx);//print the semester and year
}
    
    else if (xx==30){ //if the digits = 30
        int xxx=x/100; //extract the first four digits, which is the year
        System.out.println("The course was offered in the "+"Summer 2"+" semester of "+xxx);//print the semester and year
}
    
    else if (xx==40){ //if the digits = 40
        int xxx=x/100; //extract the first four digits, which is the year
        System.out.println("The course was offered in the "+"Fall"+" semester of "+xxx);//print the semester and year

    }
    else{ //if the digits = anthing other than above
        int xxx=x/100; //extract the first four digits, which is the year
        System.out.println(xx+" is not a legitmate semester");//print the error statement
    

}}
else{
    System.out.println("The number was outside the range [186510,201440]");//print the error statement
}

}//end of main method
}//end of class