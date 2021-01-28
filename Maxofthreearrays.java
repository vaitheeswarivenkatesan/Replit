import java.util.*;
public class Main{
  public static void Common(int num1[],int num2[],int num3[]){
    boolean found=false;
    int a=num1.length;
    int b=num2.length;
    int c=num3.length;
    for(int i=0;i<a;i++){
      for(int j=0;j<b;j++){
        if(num1[i]==num2[j]){
          for(int k=0;k<c;k++){
            if(num1[i]==num3[k]){
              System.out.println("the common numbers are:"+num1[i]);
              found=true;
            }
          } 
        }
      }
    }
    if(found==false)
      System.out.println("no common numbers");
  }
  public static void main (String[] args){
    try{
      int i;
      Scanner kb=new Scanner(System.in);
      System.out.println("enter the array1 limit");
      int x=kb.nextInt();
      int []num1=new int[x];
      for(i=0;i<x;i++){
        System.out.println("enter the "+(i+1)+" element of array1: ");
        num1[i]=kb.nextInt();
      }
      System.out.println("enter the array2 limit");
      int y=kb.nextInt();
      int []num2=new int[y];
      for(i=0;i<y;i++){
        System.out.println("enter the "+(i+1)+" element of array2: ");
        num2[i]=kb.nextInt();
      }
      System.out.println("enter the array3 limit");
      int z=kb.nextInt();
      int []num3=new int[z];
      for(i=0;i<z;i++){
        System.out.println("enter the "+(i+1)+" element of array3: ");
        num3[i]=kb.nextInt();
      }
      Common(num1,num2,num3);
    }
    catch(Exception e){
      System.out.println("enter only integers");
    }
  }      
  
}
