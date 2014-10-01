///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//BurgerKing Java Program
//By inputting the letters indicating the choice of the order and return the corresponding order. 
import java.util.Scanner; //import scanner
// define a class
public class BurgerKing{
                // main method 
               public static void main(String[] args) {
Scanner a;//decalre
a=new Scanner(System.in);//accept input

System.out.println("Enter a letter to indicate a choice of ");
System.out.println("Burger (B or b)");
System.out.println("Soda (S or s)");
System.out.println("Fries (F or f)");

String x=a.next();//give x value of input

//test if the input is a single letter

if (x.length()==1){
char xx=x.charAt(0);   
    switch(xx){
        case'B'://if the user enter B print out the following
            System.out.println("Enter A or a for ''all the fixins''");
            System.out.println("      C or c for cheese");
            System.out.println("      N or n for none of the above"); 
            String xx1=a.next();//read the next input
            char fixings=xx1.charAt(0);
                switch(fixings){
                    case'A':
                        System.out.println("You ordered a burger with all fixings");
                    break;
                    case'a':
                        System.out.println("You ordered a burger with all fixings");
                    break;
                    case'C':
                        System.out.println("You ordered a burger with cheese");
                    break;
                    case'c':
                        System.out.println("You ordered a burger with cheese");
                    break;
                    case'N':
                        System.out.println("You ordered a burger");
                    break;
                    case'n':
                        System.out.println("You ordered a burger");
                    break;
                    default:
                        System.out.println("You did not enter A/a/C/c/N/n");
                    }//end of switch B-f
        break;
        case'b'://if the user enter b print out the following
            System.out.println("Enter A or a for ''all the fixins''");
            System.out.println("      C or c for cheese");
            System.out.println("      N or n for none of the above"); 
            String xx2=a.next();//read the next input
            char fixings2=xx2.charAt(0);
                switch(fixings2){
                    case'A':
                        System.out.println("You ordered a burger with all fixings");
                    break;
                    case'a':
                        System.out.println("You ordered a burger with all fixings");
                    break;
                    case'C':
                        System.out.println("You ordered a burger with cheese");
                    break;
                    case'c':
                        System.out.println("You ordered a burger with cheese");
                    break;
                    case'N':
                        System.out.println("You ordered a burger");
                    break;
                    case'n':
                        System.out.println("You ordered a burger");
                    break;
                    default:
                        System.out.println("You did not enter A/a/C/c/N/n");
                    }//end of switch b-f
        break;
        case'S'://if the user enter S print out the following
            System.out.println("Do you want Pepsi (p or P),");
            System.out.println("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-");
            String xx3=a.next();//read the next input
            char brand=xx3.charAt(0);
                switch(brand){
                    case'P':
                        System.out.println("You ordered a Pepsi");
                    break;
                    case'p':
                        System.out.println("You ordered a Pepsi");
                    break;
                    case'C':
                        System.out.println("You ordered a Coke");
                    break;
                    case'c':
                        System.out.println("You ordered a Coke");
                    break;
                    case'S':
                        System.out.println("You ordered a Sprite");
                    break;
                    case's':
                        System.out.println("You ordered a Sprite");
                    break;
                    case'M':
                        System.out.println("You ordered a Mountain Dew");
                    break;
                    case'm':
                        System.out.println("You ordered a Mountain Dew");
                    default:
                        System.out.println("You did not enter P/p/C/c/S/s/M/m");
                    }//end of switch S-b
        break;
        case's'://if the user enter s print out the following
            System.out.println("Do you want Pepsi (p or P),");
            System.out.println("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)-");
            String xx4=a.next();//read the next input
            char brand2=xx4.charAt(0);
                switch(brand2){
                    case'P':
                        System.out.println("You ordered a Pepsi");
                    break;
                    case'p':
                        System.out.println("You ordered a Pepsi");
                    break;
                    case'C':
                        System.out.println("You ordered a Coke");
                    break;
                    case'c':
                        System.out.println("You ordered a Coke");
                    break;
                    case'S':
                        System.out.println("You ordered a Sprite");
                    break;
                    case's':
                        System.out.println("You ordered a Sprite");
                    break;
                    case'M':
                        System.out.println("You ordered a Mountain Dew");
                    break;
                    case'm':
                        System.out.println("You ordered a Mountain Dew");
                    default:
                        System.out.println("You did not enter P/p/C/c/S/s/M/m");
                    }//end of switch S-b
        break;        
        case'F'://if the user enter F print out the following
            System.out.println("Do you want a large or small order of fries (l,L,s, or S)-");
            String xx5=a.next();//read the next input
            char size=xx5.charAt(0);
                switch(size){
                    case'L':
                        System.out.println("You ordered large fries");
                    break;
                    case'l':
                        System.out.println("You ordered large fries");
                    break;
                    case'S':
                        System.out.println("You ordered small fries");
                    break;
                    case's':
                        System.out.println("You ordered small fries");
                    break;
                    default:
                        System.out.println("You did not enter L/l/S/s");
                }//end of switch F-s
        break;
        case'f'://if the user enter f print out the following
            System.out.println("Do you want a large or small order of fries (l,L,s, or S)-");
            String xx6=a.next();//read the next input
            char size2=xx6.charAt(0);
                switch(size2){
                    case'L':
                        System.out.println("You ordered large fries");
                    break;
                    case'l':
                        System.out.println("You ordered large fries");
                    break;
                    case'S':
                        System.out.println("You ordered small fries");
                    break;
                    case's':
                        System.out.println("You ordered small fries");
                    break;
                    default:
                        System.out.println("You did not enter L/l/S/s");
                }//end of switch F-s
        break;
        default:
            System.out.println("You did not enter B/b/S/s/F/f");
    }
}
else{
    System.out.println("a single character expected");
}

}//end of main mehtod
    
}//end of class