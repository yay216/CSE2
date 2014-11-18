///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//PokerOdds Program
//by adding two method showhands which would ramdomly display five cards.
//simulateodds runs the same program 10000times and count the number of times that there is exactly one pair and what the pair of cards are. moreover it also displays the number of runs that the hand doesnt consist exactly one pair.
import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    showHands();//call method showHands
    simulateOdds();//call method simulateOdds
  }
  
  
  
//method showHands:generate random poker hands, prompting the user if they would like another hand to be generated (it will repeat as long the user desires).   
  public static void showHands(){
    Scanner scan=new Scanner(System.in);
    int i=51;
    int createdeck=0;
    int deck[]=new int[52];
    int x[]=new int[5];
    int drawn=0;
    int draw;
    String scann="";
    
    
    
    while(createdeck<52){
    deck[createdeck]=createdeck+1;
    createdeck++;}//create the deck-- an array with 52 element start from 1 to 52
    
    
    
    do{
        i=51;
        drawn=0;
     while(drawn<5){
      draw=(int)(Math.random()*i);
      x[drawn]=deck[draw];
    
    int temp = deck[draw];
     for(int c=0;c<51;c++){
       if(c>=draw){
             deck[c] = deck[c+1];}
     }
       deck[i] = temp;//swap the tested value all the way to the end
     
       drawn++;
       i--;
     } //draw a hand
     
     
     
 
     
     
     int k=0;
     String c="";
     String s="";
     String d="";
     String h="";
     int test4=(int)(x[k]/13);
     int test=x[k]%13;
     //initiate varibles
     
     
     while(k<5){
          test=x[k]%13;
         test4=(int)(x[k]/13);
      if (test4==0){
          if(test==0)
          c=c+" A";
          else if(test==1)
          c=c+" K";
          else if(test==2)
          c=c+" Q";
          else if(test==3)
          c=c+" J";
          else if(test==4)
          c=c+" 10";
          else if(test==5)
          c=c+" 9";
          else if(test==6)
          c=c+" 8";
          else if(test==7)
          c=c+" 7";
          else if(test==8)
          c=c+" 6";
          else if(test==9)
          c=c+" 5";
          else if(test==10)
          c=c+" 4";
          else if(test==11)
          c=c+" 3";
          else 
          c=c+" 2"; // add the cards to Clubs catagory
      }
      else if (test4==1){
          if(test==0)
          s=s+" A";
          else if(test==1)
          s=s+" K";
          else if(test==2)
          s=s+" Q";
          else if(test==3)
          s=s+" J";
          else if(test==4)
          s=s+" 10";
          else if(test==5)
          s=s+" 9";
          else if(test==6)
          s=s+" 8";
          else if(test==7)
          s=s+" 7";
          else if(test==8)
          s=s+" 6";
          else if(test==9)
          s=s+" 5";
          else if(test==10)
          s=s+" 4";
          else if(test==11)
          s=s+" 3";
          else 
          s=s+" 2";// add the cards to Spades catagory
      }
      else if (test4==2){
          if(test==0)
          d=d+" A";
          else if(test==1)
          d=d+" K";
          else if(test==2)
          d=d+" Q";
          else if(test==3)
          d=d+" J";
          else if(test==4)
          d=d+" 10";
          else if(test==5)
          d=d+" 9";
          else if(test==6)
          d=d+" 8";
          else if(test==7)
          d=d+" 7";
          else if(test==8)
          d=d+" 6";
          else if(test==9)
          d=d+" 5";
          else if(test==10)
          d=d+" 4";
          else if(test==11)
          d=d+" 3";
          else 
          d=d+" 2";//// add the cards to Dimonds catagory
      }
      else{
      if(test==0)
          h=h+" A";
          else if(test==1)
          h=h+" K";
          else if(test==2)
          h=h+" Q";
          else if(test==3)
          h=h+" J";
          else if(test==4)
          h=h+" 10";
          else if(test==5)
          h=h+" 9";
          else if(test==6)
          h=h+" 8";
          else if(test==7)
          h=h+" 7";
          else if(test==8)
          h=h+" 6";
          else if(test==9)
          h=h+" 5";
          else if(test==10)
          h=h+" 4";
          else if(test==11)
          h=h+" 3";
          else 
          h=h+" 2";// add the cards to Hearts catagory
      
     }
     k++;}

  
       
    i=51;
    System.out.println("Clubs:"+c);
    System.out.println("Dimonds:"+d);
    System.out.println("Hearts:"+h);
    System.out.println("Spades:"+s);//print out the result for the 5 cards.
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");//print the statement ask the user if they want to run the same program again.
    scann=scan.next();//accept input from scan, type: String
    }while(scann.equals("y")||scann.equals("Y"));
  }
  
  
  
  
  
  
  
//randomly generate 10000 hands and count the number of times 
//that a hand with a pair of a specific rank occurs, along with 
//the number of hands that do not have a pair. 
  public static void simulateOdds(){
    
    int A=0;
    int K=0;
    int Q=0;
    int J=0;
    int Ten=0;
    int Nine=0;
    int Eight=0;
    int Seven=0;
    int Six=0;
    int Five=0;
    int Four=0;
    int Three=0;
    int Two=0;
    int nahh=0;
    int watsssss=0;
    //initiate varibles.
    do{
      
    int i=51;
    int createdeck=0;
    int deck[]=new int[52];
    int x[]=new int[5];
    int drawn=0;
    int draw;
    while(createdeck<52){
    deck[createdeck]=createdeck+1;
    createdeck++;}//create the deck-- an array with 52 element start from 1 to 52
        i=51;
        drawn=0;
     while(drawn<5){
      draw=(int)(Math.random()*i);
      x[drawn]=deck[draw];
    
    int temp = deck[draw];
     for(int c=0;c<51;c++){
       if(c>=draw){
             deck[c] = deck[c+1];}
     }
       deck[i] = temp;//swap the tested value all the way to the end
     
       drawn++;
       i--;
     } //draw a hand
     
     
     
     
     //next test on duplicates
     int test1=0;
     int counts=0;
     int yay=-1;
     // test for each one of the cards if they are the same with others
     while(test1<5){
      
     if(x[0]%13==x[test1]%13){
       counts++;//count the number of sames.
       yay=0;//give value 0 to yay is x[0] equals that number
     }

     test1++;}
     if(counts==2&&yay!=-1){
       int test=x[yay]%13;
       if(test==0)
       A++;
       else if(test==1)
       K++;
       else if(test==2)
       Q++;
       else if(test==3)
       J++;
       else if(test==4)
       Ten++;
       else if(test==5)
       Nine++;
       else if(test==6)
       Eight++;
       else if(test==7)
       Seven++;
       else if(test==8)
       Six++;
       else if(test==9)
       Five++;
       else if(test==10)
       Four++;
       else if(test==11)
       Three++;
       else
       Two++;
     }
     else
     nahh++;
     
     watsssss++;
     counts=0;
     }while(watsssss<10000);
    System.out.println("rank  frequency of exactly one pair");
    System.out.println(" A    "+A);
    System.out.println(" K    "+K);
    System.out.println(" Q    "+Q);
    System.out.println(" J    "+J);
    System.out.println(" 10    "+Ten);
    System.out.println(" 9    "+Nine);
    System.out.println(" 8    "+Eight);
    System.out.println(" 7    "+Seven);
    System.out.println(" 6    "+Six);
    System.out.println(" 5    "+Five);
    System.out.println(" 4    "+Four);
    System.out.println(" 3    "+Three);
    System.out.println(" 2    "+Two);
    System.out.println("----------------------------");
    System.out.println("total not exactly one pair: "+nahh);

    //print out the results.
  }
}