import java.util.Scanner;
public class Methods{
    public static int getInt(Scanner scan){
       scan= new Scanner(System.in);
   
        while(!scan.hasNextInt()){
            System.out.println("You did not enter an int; try again");
            scan= new Scanner(System.in);
        }
        int x= scan.nextInt();
          return x;
        
        
    }
    public static int larger(int x,int y){
        if (x>y)
        return x;
        else 
        return y;
    }
    public static boolean ascending(int a,int b,int c){
        if (a<b&&b<c)
        return true;
        else 
        return false;
    }
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
  }
}
