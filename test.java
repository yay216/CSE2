import java.util.Scanner;
public class test{
   
    public static int wwww( int x[], int y[]){
        int []temp;
        temp=x;
        temp[y[1]]=42;
        x=y;
    y=temp;
    y[0]=33;
        return y[x[0]];
    }
    public static void print(int []x){
        for(int i=0; i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        
    }
   
    
    public static void main(String []arg){
    int x[]={1,2,4,6};
    int u[]={3,4,5,6,7};
    int v[]={2,21,5};
     System.out.println(wwww(x,v));
     print(x);
     print(v);
     
   

    }
}
        