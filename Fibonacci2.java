import java.util.*;
public class Fibonacci2{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    System.out.println("ENter a num:");
    int n=kb.nextInt();
    int a=0,b=1;
    while(b<=n){
      System.out.println(b);
      b=a+b;   
      a=b-a;
      
    }
  }
}