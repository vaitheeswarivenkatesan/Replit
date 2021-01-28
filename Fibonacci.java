import java.util.*;
public class Fibonacci{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    int a=0,b=1,i=1;
    System.out.println(b);
    while(i<5){
      b=a+b;   
      System.out.println(b);
      a=b-a;
      i++;
    }
  }
}
