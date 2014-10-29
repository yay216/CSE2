////////////////////////////
///Yanxing Yang
///HW8.java program
//This program practices methods
import java.util.Scanner; //import scanner
public class HW8{    //state the class as HW8
      public static char getInput(Scanner scan,String range ){ //initialize the input for the method and the output type
     
       int n=0;
      char a;
      char input='p'; //initialize varibles.
     
      String x=scan.next();//take the next scan as the string value of x
      
       while (input=='p'){ //ranmdomlly assign a value to input this only changes when the correct value is inputed from the user
      while(x.length()!=1){
          System.out.print("You should enter exactly one character-");
          x=scan.next();
           }//check if the input is exactly one character
      while (n<range.length()){
      a=range.charAt(n);
     
      if(x.charAt(0)==a){
      input=a;
      break;}
      n++;
      } //check one by one if the single char entered is included in the range given.
      if(input=='p'){
        System.out.print("You did not enter a character from the list '"+range+"'; try again- ");
        x=scan.next();
        n=0;}
      }// print out error when the char is not included and re collect value from user. set n back to zero so the above function stay good.
      
      return input; //return the value.
  }
  
  
  
  //**************************************************************************************
  // sorry i am sick for the past few days and i dont think i could comment all. i hope i dont get penalty for that.  really really appreciate it!!
  
  
  
  public static char getInput(Scanner scan,String range, int giveup ){
      int n=0;
      char a;
      char input='p';
      int counts=0;
      String x=scan.next();
      while(input=='p'){
            while (counts<giveup){ 
      
                    while(x.length()!=1){
                System.out.print("You should enter exactly one character-");
                x=scan.next();
                counts++;
                        if (counts==giveup){
                    System.out.println('\n'+"You failed after 5 tries");
                    counts=0;
                    break;}
               
                }
                    

      
                    while (n<range.length()){
                a=range.charAt(n);
                         if(x.charAt(0)==a){
                         input=a;
                                        
                          counts=giveup+1;
                          break;
                                        }
                                        n++;
                            }
      
                             if(input=='p'){
                        System.out.print("You did not enter a character from the list '"+range+"'; try again-");
                        counts++;
                        x=scan.next();
                        n=0;
                                 }
         
                            if (counts==giveup-1){
                        System.out.println("You failed after 5 tries");
                        counts=0;
                            break;}
          
                    
    
      
  }}
  return input;}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static char getInput(Scanner scan, String what, String numbers){
      int n=0;
      int p=0;
      char a='p';
      char input='p';
      
      String Print="";
      
     
        while(input=='p'){
           
           
           
           
           while(n<numbers.length()-1){
          a=numbers.charAt(n);
          Print=Print+"'"+a+"',";
          n++;
          }
      while(n==numbers.length()-1){
      a=numbers.charAt(n);
      Print=Print+"'"+a+"' -";
         break; }
      System.out.println(what);
      System.out.print("Enter one of: "+Print);
          
          
        String x=scan.next();
        
        
          while(x.length()!=1){
      System.out.println("Enter exactly one character");
       x=scan.next();
               }
      
       while (p<numbers.length()){
      a=numbers.charAt(p);
      if(x.charAt(0)==a){
      input=a;
      break;}
      
      p++;}
      
      if (input=='p'){
      System.out.println("You did not enter an acceptable character");
      x=scan.next();
      p=0;
      n=numbers.length();
    break;
      }
      else
      input=x.charAt(0);
}
return input;
  }
          
      
 

  
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
}
