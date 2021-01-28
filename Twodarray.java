import java.util.*;
public class Twodarray{
  public static void main (String[] args){
    int i,j;
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the array limit");
    int x=kb.nextInt();
    int y=kb.nextInt();
    double [][]num=new double[x][y];
    for(i=0;i<x;i++){
      for(j=0;j<y;j++){
        System.out.println("enter a new num:");
        num[i][j]=kb.nextDouble();
      }
    } 
    for(i=0;i<x;i++){
      for(j=0;j<y;j++){
        System.out.println(num[i][j]);
      }
    } 
    
    
  }
}

