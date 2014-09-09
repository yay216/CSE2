/////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//hw02 Walmart Shopping Java Program
// first compile the program
// javac Arithmetic java
//run the program
// java Arithmetic//

//define a class
public class Arithmetic{
//main method
public static void main(String[] args){
//number of pairs of socks
    int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
    double sockCost$=2.58;

//Number of drinking glasses
    int nGlasses=6;
//Cost per glass
    double glassCost$=2.29;

//Number of boxes of envelopes
    int nEnvelopes=1;
//cost per box of envelopes
    double envelopeCost$=3.25;
    double taxPercent=0.06;
// create varibles.


    double totalSockCost$=nSocks*sockCost$;   //total cost of socks
    double taxSocks$=(int)(totalSockCost$*taxPercent*100)/100.0;//total sales tax for socks.
    double totalDrinkCost$=nGlasses*glassCost$;   //total cost of drinks
    double taxDrink$=(int)(totalDrinkCost$*taxPercent*100)/100.0;//total sales tax for drinks
    double totalEnvelopesCost$=nEnvelopes*envelopeCost$;   //total cost of envelopes
    double taxEnvelopes$=(int)(totalEnvelopesCost$*taxPercent*100)/100.0;//total sales tax for envelopes
    double totalBeforetaxCost$=totalSockCost$+totalDrinkCost$+totalEnvelopesCost$;   //total cost of purchases(before tax)
    double totalAftertaxCost$= totalBeforetaxCost$*(1+taxPercent);   //actually paid for this transaction including sales tax
   double  tbc=(int)(totalBeforetaxCost$*100)/100.0;
   double  tac=(int) (totalAftertaxCost$*100)/100.0;
   double ttst=tac-tbc;
   double  tst=(int) (ttst*100)/100.0;
    //print out results
System.out.println("Socks");
System.out.println("     #of pairs bought  "+nSocks);//number of socks bought.
System.out.println("     unit cost         "+sockCost$);//unitcost of socks.
System.out.println("     total cost b4 tax "+totalSockCost$);//total socks cost before tax.
System.out.println("     total tax on socks"+taxSocks$);//total tax on socks.
System.out.println("Drinks");
System.out.println("     #of glasses bought "+nGlasses);//number of drinks bought.
System.out.println("     unit cost          "+glassCost$);//unitcost of a glass of drink.
System.out.println("     total cost b4 tax  "+totalDrinkCost$);//total drinks cost before tax.
System.out.println("     total tax on drinks"+taxDrink$);//total tax on drinks.
System.out.println("Envelopes");
System.out.println("     #of boxes bought      "+nEnvelopes);//number of envelopes bought.
System.out.println("     unit cost             "+envelopeCost$);//unitcost of an envelope.
System.out.println("     total cost            "+totalEnvelopesCost$);//total envelopes cost before tax.
System.out.println("     total tax on envelopes"+taxEnvelopes$);//total tax on envelopes.
System.out.println("The total cost of purchases(before tax) is "+tbc);
System.out.println("The total sales tax is "+tst);
System.out.println("The total cost of purchases(after tax) is "+tac );

    
     
        
        
    }//end of main method 
}//end of class