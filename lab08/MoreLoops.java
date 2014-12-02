import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

    System.out.print("Enter an int- ");
    boolean test=(scan.hasNextInt());
    if (test==false){
    do{
        
        scan.next(); //get rid of the junk entered by user
        System.out.print("You did not enter an int; try again- ");
    }while(!scan.hasNextInt());
    }
    
    
    //Keep the user entering till they enter an integer
    //DO-WHILE LOOP
        n=scan.nextInt();
    int j=0;
    int k=0;
    while (j<n && j<40){
        j++;
        while (k<j+1){
            j++;
            System.out.print('*');
        }
         System.out.println();
    }

    /*print in the form of 
      *
      **
      ***
      .... 
      for n=scan
   WHILE STATEMENTS
    */   
    k=4;

    while (k<5){
        System.out.println("k="+k);
        k++;
    }
         
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP
    
// The above loop prints k=4

        int count=0;
        while(true){
        
        
    
        if (n==1||n==2){
        System.out.print("Case 2 ");
      continue;}
        else if (n==3)
        break;
      else if (n==4){
       
         System.out.println("Case 4");
     System.out.println("Case 5");
       
      }
      else if (n==5)
       System.out.println("Case 5");
        count++;
        if(count>10)
        break;
    }
    //COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
}