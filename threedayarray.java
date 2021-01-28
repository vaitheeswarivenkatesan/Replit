//to form 3d array

import java.util.*;
class Main{
  public static void main (String[] args){
    int i,j,k;
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the 3d array limit");
    int x=kb.nextInt();
    int y=kb.nextInt();
    int z=kb.nextInt();
    int [][][]num=new int[x][y][z];
    for(i=0;i<x;i++){
      for(j=0;j<y;j++){
        for(k=0;k<z;k++){
          System.out.println("enter a new num for "+(j+1)+" row "+(k+1) +" column of "+(i+1)+" array: ");
          num[i][j][k]=kb.nextInt();
        }
      }
    } 
    System.out.println("\nthe above matrix is:");
    for(i=0;i<x;i++){
      System.out.print("{");
      for(j=0;j<y;j++){
        System.out.print("(");
        for(k=0;k<z;k++){
          System.out.print(num[i][j][k]);
          if(k!=(z-1))
            System.out.print(",");   
        }
        System.out.print(")");
      } 
      System.out.println("}");
      System.out.println();
    } 
  }
}

