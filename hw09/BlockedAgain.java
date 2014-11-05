////////////////////////////////////
////Yanxing Yang///////////////////
///BlockedAgain.java//////////////
///hw09//////////////////////////
import java.util.Scanner;//import scanner
public class BlockedAgain{//define class






public static int getInt(){//force user to input a integer method
    System.out.print("Enter an in int between 1 and 9, inclusive:");//print out the order:"Enter an in int between 1 and 9, inclusive:"
     Scanner scan= new Scanner(System.in);//read input
     while(checkInt(scan)==false){//while its not integer
     scan= new Scanner(System.in);//accept new scan
     }
     int x= scan.nextInt();//jump out of the while loop when it is an integer let x has the value of the integer
     x=checkRange(x);//check if the integer is within 1-9
     
     return x; //return the number
}






public static boolean checkInt(Scanner scan){//method that checks if the integer is within 1-9
   if(!scan.hasNextInt()){// if the scanned number is not an intger
            System.out.print("You did not enter an int; try again: ");//print out order to ask user to print again
            
        return false;//return false.
   }
   else
   return true;//if it is an intger return true.
}






public static int checkRange(int x){ //check if the integer is within 1-9
   while(x<1||x>9){// while x is not within the 1-9 range
   System.out.print("You did not enter an int in [1,9]; try again: ");//ask the user to print again
   x=getInt();//call the getint method again
       
   }
   
   return x;// when x is within range, return x.

}




public static void allBlocks(int x){//method that prints the desired numbers, lines and spaces.
int y=x;
String line="-";
String space="";
int number=1;
int count=1;
int i=0, j=0, k=0, l=0;//define some varibles.

while(i<x){//do the following when the counts is less that the input number.
    block(count, number, y, l, space, j, k);//call the block function given the following input
    lines(line, l, y, space);//call the lines fuctions given the following input
    j=0;//reset j to zero to ensure that we get the correct number of spaces
    i++;//add i by one so the while loop stops when everything is printed
    number+=1;//add number by one for the second block of numbers to be printed
    count+=2;//add count by 2 to ensure the number of number printed is increased by 2
    line+="--";//add line by -- to ensure the number of lines printed is increased by 2
    y--;//minus y by 1 to ensure the number of space is decending by one as number rises.
    space="";//reset space for getting the correct space for next number.
}

}
public static void block(int count,int number,int y, int l, String space, int j, int k){ //for numbers and space


   while(l<y){
        space+=" ";
        l++;
    }
    l=0;//get the correct number of spaces

    while(j<number){
        System.out.print(space);//print spaces
        while(k<count){
            System.out.print(number);//print numbers
            k++;
        }
    k=0;
    System.out.println("");
    j++;
    }
}
public static void lines(String line, int l, int y, String space){ //for lines and space
        

   while(l<y){
        space+=" ";
        l++;
    }
    l=0;
    System.out.println(space+line);//print space and line
   
}





public static void main(String []s){
int m;
//force user to enter int in range 1-9, inclusive.
m = getInt(); 
allBlocks(m);//print the blocks
}
}
