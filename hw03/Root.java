///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//Root Java Program
//By inputting number to get the crude estimate of its cube root.

import java.util.Scanner;
//define a class
public class Root {
    //mainthod
     public static void main(String[] args){
    Scanner input;
    input=new Scanner(System.in );
    System.out.print("Enter a double, and I print its cube root- "); //print out the initial input and let the reader input the number.
    int x= input.nextInt();
    double guess=x/3;
    double guess1=(2*guess*guess*guess+x)/(3*guess*guess);
    double guess2=(2*guess1*guess1*guess1+x)/(3*guess1*guess1);
    double guess3=(2*guess2*guess2*guess2+x)/(3*guess2*guess2);
    double guess4=(2*guess3*guess3*guess3+x)/(3*guess3*guess3);
    double guess5=(2*guess4*guess4*guess4+x)/(3*guess4*guess4);
    double xx=guess5*guess5*guess5;//Do the calculation throught out the 5 guesses.
    System.out.print("The cube root is "+guess5+":"+guess5+"*"+guess5+"*"+guess5+"="+xx);//print out the result.
}//end of main method
}//end of class
