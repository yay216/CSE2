///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//Roulette Java Program
//

// define a class
public class Roulette{
public static void main(String[] args) {
    int exp=0;
    int spin=0;
    int success=0;
    int fail=0;
    int win=0;
    int lose=0;
    int totalsuccess=0;
    while (exp<1000){
        spin=0;
        success=0;
        fail=0;
        while(spin<100){
           double x=Math.random();
           if (x<0.02631579){
           success++;
           totalsuccess++;}
           else{
           fail++;}
           spin++;}
        if (success>2)
        win++;
        if(success==0){
        lose++;}
        exp++;
    }
int total=totalsuccess*36;
System.out.println("The number of times I lose everything is "+lose);
System.out.println("The total winings is $ "+total);
System.out.println("The number of times a walked away with winings is "+win);
}//end of main method
}//end of class