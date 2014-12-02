import java.util.Scanner;
public class Arrays{

public static void main(String [] arg){
    String ints="";
    Scanner scan;
      int sum=0;
    scan=new Scanner(System.in);
    int[] array= new int[10];
System.out.print("Enter 10 ints -");
    for(int i=0; i<10; i++){
        array[i]=scan.nextInt();
        ints=ints+array[i]+" ";
        sum=sum+array[i];
    }
  
    int Max=array[0];
    int Min=array[0];
    for(int i=0; i<9; i++){
    if(array[i]<array[i+1])
    Max=array[i+1];
    else{
    Min=array[i+1];}
    
    }

System.out.println("The lowest entry is "+Min);
System.out.println("The highest entry is "+Max);
System.out.println("The sum is "+sum);
for(int i=0; i<10; i++){
    System.out.println(array[i]+" "+array[9-i]);
}
}
}
