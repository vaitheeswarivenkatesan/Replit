import java.util.*;
public class Reversearray{
  public static void main (String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the array limit");
    int x=kb.nextInt();
    int[] num=new int[x];
    int d=num.length;
    for(int i=0;i<d;i++){
      System.out.println("enter a new num:");
      num[i]=kb.nextInt();
    } 
    int m=0;
    for(int i=0;i<d/2;i++){
      m=num[d-i-1];
      num[d-i-1]=num[i];
      num[i]=m;
    }
    System.out.println("\nReverse order is");
    for(int i=0;i<d;i++){
      System.out.println(num[i]);
    }
  }
}





