///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//BoolaBoola Java Program
//a program that has three boolean variables to each of which the value of true or false is randomly assigned. Then, at random, combine the three variables with random choices of && and || and stores the result. F
import java.util.Scanner; //import scanner
// define a class
public class BoolaBoola{
                // main method 
               public static void main(String[] args) {
Scanner myScanner;//decalre
myScanner=new Scanner(System.in);//accept input

double a=Math.random();//1st t/f    <0.5 true
double b=Math.random();//2nd t/f
double c=Math.random(); //3rd t/f
double d=Math.random();//1st || &&, <0.5 ||
double e=Math.random(); //2nd || &&



if (a<0.5){
    if(b<0.5){
        if(c<0.5){
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does true || true || true have the value true(t/T) or false(f/F)? ");
                    String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true || true && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                     if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does true && true || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true && true && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        else{
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does true || true || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true || true && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does true && true || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true && true && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        }
    else{
        if(c<0.5){
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does true || false || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true || false && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does true && false || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true && false && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        else{
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does true || false || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true || false && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does true && false || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does true && false && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        }
    }
else{
    if(b<0.5){
        if(c<0.5){
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does false || true || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false || true && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does false && true || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false && true && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        else{
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does false || true || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false || true && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does false && true || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false && true && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        }
    else{
        if(c<0.5){
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does false || false || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false || false && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does false && false || true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("T")||r.equals("t")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false && false && true have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        else{
            if(d<0.5){
                if(e<0.5){
                    System.out.println("Does false || false || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false || false && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            else{
                if(e<0.5){
                    System.out.println("Does false && false || false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                    }
                else{
                    System.out.println("Does false && false && false have the value true(t/T) or false(f/F)? ");
                     String r= myScanner.next();
                    if(r.equals("f")||r.equals("F")){
                        System.out.println("Correct");
                    }
                    else{
                        System.out.println("Wrong: try again");
                    }
                }    
                }
            }
        }
    }
    



}//end of method
}//end of class