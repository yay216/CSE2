///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//PokerHands java program
//ask user to enter five cards and intepret whether its a house straight flush and etc.

import java.util.Scanner;//import scanner
public class PokerHands{

//main method
  public static void main(String [] arg){
  Scanner scan=new Scanner(System.in);
  
  
  int[] array=new int[5];
  String a1="ooops";
  while(a1.equals("ooops")){
  int i=0;
  while(a1.equals("ooops")){
    System.out.print("Enter 'y' or 'Y' to enter a(nother) hand-");
    a1=scan.next();
    if (a1.equals("y")||a1.equals("Y"))
        a1="staaaaap";
     else{
         a1="ooops";
         System.out.println("You did not enter a valid response"); 
     }
  }
  a1="ooops";
  while(i<5){
      
  String a2="ooops";
  String a3="ooops";
  int a=-1; 
  int b=-1;
      
  
  
  while(a2.equals("ooops")){
  System.out.print("Enter the suit: 'c', 'd', 'h', or 's'-");
  a2=scan.next();
    if(a2.equals("c")||a2.equals("d")||a2.equals("h")||a2.equals("s")){
        if(a2.equals("c"))
        a=0;
        else if(a2.equals("d"))
        a=1;
        else if(a2.equals("h"))
        a=2;
        else if(a2.equals("s"))
        a=3;
        
    }
    else{
        a2="ooops";
        System.out.println("You did not enter a valid response");     
    }
  }
  
  while(a3.equals("ooops")){
    System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'-");
    a3=scan.next();
    if (a3.equals("a")||a3.equals("k")||a3.equals("q")||a3.equals("j")||a3.equals("10")||a3.equals("9")||a3.equals("8")||a3.equals("7")||a3.equals("6")||a3.equals("5")||a3.equals("4")||a3.equals("3")||a3.equals("2")){
        if(a3.equals("a"))
        b=0;
        else if(a3.equals("k"))
        b=1;
        else if(a3.equals("q"))
        b=2;
        else if(a3.equals("j"))
        b=3;
        else if(a3.equals("10"))
        b=4;
        else if(a3.equals("9"))
        b=5;
        else if(a3.equals("8"))
        b=6;
        else if(a3.equals("7"))
        b=7;
        else if(a3.equals("6"))
        b=8;
        else if(a3.equals("5"))
        b=9;
        else if(a3.equals("4"))
        b=10;
        else if(a3.equals("3"))
        b=11;
        else
        b=12;
        
    }
    else{
    a3="ooops";
    System.out.println("You did not enter a valid response");
    }
  }
  
  
  array[i]=a*13+b;
  
  int check=0;
  int k=0;
  while(k<i){
      if (array[k]==array[i]){
      check++;break;}
      k++;
  }
  i++;
  if (check==1){
  System.out.println("You already entered that card");
  i--;
  }
  
  
  }
  
  showOneHand(array);//display the cards chosen
  
  
  int[] Rank= new int[5];
  for(int e=0; e<5;e++){
      Rank[e]=array[e]%13;
  }
  java.util.Arrays.sort (Rank);
  // create an array that displays the ranks sorted!!
  
 int[] Suit=new int[5];
 for(int f=0;f<5;f++){
      Suit[f]=(int)(array[f]/13);
  }// create an array that displays the suits
  
 
 
  
  int[] frequency= new int[13];
  for(int w=0; w<13; w++){
      int count=0;
      for(int q=0;q<5;q++){
          if (Rank[q]==w)
          count++;
      }
      frequency[w]=count;
  }//count the frequency of ranks ************************************
  
  int[] fsuits= new int[4];
  for(int u=0; u<4; u++){
      int count=0;
      for(int o=0;o<5;o++){
          if (Suit[o]==u)
          count++;
      }
      fsuits[u]=count;
  }//count the frequency of suits **************************************
  
  // count zeros ones twos threes fours
  int zeros=0;
  int ones=0;
  int twos=0;
  int threes=0;
  int fours=0;
  
  for(int y=0; y<13;y++){
      if (frequency[y]==0)
      zeros++;
      else if(frequency[y]==1)
      ones++;
      else if(frequency[y]==2)
      twos++;
      else if(frequency[y]==3)
      threes++;
      else
      fours++;
  }
  
  int[] pairs=new int[5];
  pairs[0]=zeros;
  pairs[1]=ones;
  pairs[2]=twos;
  pairs[3]=threes;
  pairs[4]=fours;
  
  
  
  
  
  // test all..
  
  //test straight
  boolean straight=false;
  for(int r=0; r<9;r++){
      if(frequency[r]==1&frequency[r+1]==1&frequency[r+2]==1&frequency[r+3]==1&frequency[r+4]==1)
      straight=true;
  }
  
 //test flush
 boolean flush=false;
  for(int i1=0; i1<4; i1++){
      if (fsuits[i1]==5){
         flush=true;
      }
  
  
 //test royal
 boolean royal=false;
 if(Rank[0]==0){
 royal=true;}
 
 //test four of a kind
 boolean fourofakind=false;
 for(int i2=0; i2<13;i2++){
     if (frequency[i]==4)
     fourofakind=true;
 }
 
 //test full house
 int sat=0;
 boolean fullhouse=false;
 for(int i3=0; i3<13;i3++){
     if (frequency[i]==3){
        sat++;}
     if (frequency[i]==2){
        sat++;
     }
 }
 if (sat==2){
 fullhouse=true;}
 
 
 //test two pair
 sat=0;
 boolean twopair=false;
for(int i4=0; i4<13;i4++){
   if (frequency[i]==2){
        sat++;}
}
if(sat==2){
    twopair=true;
}

//test one pair
 sat=0;
 boolean onepair=false;
for(int i5=0; i5<13;i5++){
   if (frequency[i]==2){
        sat++;}
}
if(sat==1){
    onepair=true;
}

/**test high card
boolean highcard=false;
sat=0;
if (straight==false){
    for(int i6=0; i6<13;i6++){
   if (fsuits[i]==1){
        sat++;}
}
    for(int i7=0; i7<13;i7++){
   if (frequency[i]<2)
    sat=sat;
    else 
    sat++;
}
if (sat==3){
highcard=true;}
}*/

//print results


if(royal==true){
    if(flush==true&&straight==true)
    System.out.println("This is a Royal Flush");
}
else{
    if(straight==true&flush==true){
        System.out.println("This is a Straight Flush");
    }
    else {
        if(straight==true)
        System.out.println("This is a Straight");
        else if(flush==true)
        System.out.println("This is a Flush");
        else if (fourofakind==true)
        System.out.println("This is a Four of A Kind");
        else if (fullhouse==true)
        System.out.println("This is a Fullhouse");
        else if (twopair==true)
        System.out.println("This is a Two Pair");
        else if (onepair==true)
        System.out.println("This is a One pair");
        else
        System.out.println("This is a High Card");
    }
}
 
  
  
  

  
  
}// one run




  }
  
  
  
  
   public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ",              "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
 

  }
  
    
