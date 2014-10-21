///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//NumberStack Java Program
//
import java.util.Scanner; //import scanner
// define a class
public class NumberStack{
                // main method 
               public static void main(String[] args) {
Scanner myScanner;//decalre
myScanner=new Scanner(System.in);//accept input

System.out.print("Enter a number between 1 and 9- ");
int x=myScanner.nextInt();
int num=1;
int pnum=1;
String line="-";

System.out.println("Using for loops: ");
for(int count=0; count<x; count++){
    for (int count1=0; count1<num; count1++){
        for(int count2=0; count2<pnum; count2++){
        System.out.print(num);
        }
    System.out.println("");
    }
    System.out.println(line);
    line=line+"--";
    num++;
    pnum+=2;
}

num=1;
pnum=1;
line="-";
int count=0;
int count1=0;
int count2=0;
System.out.println("Using while loops");
while (count<x){
    while (count1<num) {
        while (count2<pnum) {
        System.out.print(num);
        count2++;
        }
    System.out.println("");
    count1++;
    count2=0;
    }
    System.out.println(line);
    line=line+"--";
    num++;
    pnum+=2;
    count++;
    count1=0;
    count2=0;
    
}

num=1;
pnum=1;
line="-";
 count=0;
 count1=1;
 count2=1;
System.out.println("Using do-while loops");
do{
  do {
        do {
        System.out.print(num);
        count2++;
        }while (count2<pnum);
    System.out.println("");
    count1++;
    count2=1;
    }  while (count1<num);
    System.out.println(line);
    line=line+"--";
    num++;
    pnum+=2;
    count++;
    count1=1;
    count2=1;
    
}
while (count<x);    


}//end of main method
}//end of class