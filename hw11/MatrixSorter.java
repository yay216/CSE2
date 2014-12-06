///////////////////////////////////////////////////////////////////////////////
//Yanxing Yang
//MatrixSorter java program
//create a 3d matrix and sort the 3rd slab
  public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }//main method
   
   
   
   
   //return a ragged 3D array
   public static int[][][] buildMat3d(){
       int[][][] array=new int[3][][];
       for(int i=0; i<3;i++){
            array[i]=new int[3+2*i][];
            
           for(int j=0;j<3+2*i;j++){
               array[i][j]=new int[i+j+1];
               
               for(int k=0;k<i+j+1;k++){
                   array[i][j][k] = (int)(Math.random()*99+1);
               }
               
           }
       }
       return array;
   }
   
   
   
   
   //should print out the array (all slabs)
   public static void show(int [][][]array){
       
       for(int i=0; i<3;i++){
           int ii=i+1;
           System.out.println("---------------------------Slab"+ii);
           for(int j=0;j<3+2*i;j++){
               
               for(int k=0;k<array[i][j].length;k++){
                   System.out.print(array[i][j][k]+" ");
               }
               System.out.print("\n");
           }
       }
       
   }
   
   
   
   //find the smallest entry in the array
   public static int findMin(int [][][]buildMat3d){
       int min=101;
       for(int i=0; i<3;i++){
           for(int j=0;j<3+2*i;j++){
               for(int k=0;k<i+j+1;k++){
                   if (buildMat3d[i][j][k]<min){
                       min=buildMat3d[i][j][k];
                   }
                   else 
                   min=min;
               }
               
           }
       }
       return min;
   }
   /**
   public static int findMin(int [][]buildMat3d){
       int min=101;
       
           for(int j=0;j<buildMat3d.length;j++){
               for(int k=0;k<j+1+(buildMat3d.length-3)/2;k++){
                   if (buildMat3d[j][k]<min){
                       min=buildMat3d[j][k];
                   }
                   else 
                   min=min;
               }
               
           }
       
       return min;
   }
   */
   
   
   
   
   //take as input a ragged 2D array. It should sort the entries in each row of the array, using a selection sort. 
   //Then it should sort the rows by the value in the first column of each row using an insertion sort
   public static int [][]sort(int[][] array){
       
       int yes=0;
        int a=0;
        int b=0;
       int k=0;
       int j=0;
       int l=1;
        while(j<7){
            // from row 0 to end
            
            while (k<j+3){
                //fixed from 0 to end jk
                l=k+1;
                while(l<j+3){
                // look for min
                int min=array[j][k+1];
                if (min>=array[j][l]) {
                min=array[j][l];
                 a=j;
                 b=l;
                 yes++;}
                 else{
                     min=min;
                 }
                    l++;
                }
            
                      if(yes>1){
                       int temp=array[j][k];
                       array[j][k]=array[a][b];
                       array[a][b]=temp;
            
                     }
                 yes=0; 
                 k++;
            }      
               java.util.Arrays.sort (array[j]);    
               j++;    
               
        }
        
        for(int i1=1;i1<7;i1++){
            int i2=i1;
            while (i2-1>=0){
            if (array[i2][0]<array[i2-1][0]){
                int[] temp= array[i2];
                array[i2]=array[i2-1];
                array[i2-1]=temp;
            }
            i2--;
            }
        }
       
        
    
         return array;
       
       
   }

   
   
   
}
