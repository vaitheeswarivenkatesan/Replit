import java.util.*;
public class Reverse{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    System.out.println("enter a new number:");
    int n=kb.nextInt();
    int a,b,c,d,x,y;
    a=n%10;
    x=n/10;
    b=x%10;
    c=x/10;
    System.out.println(a+""+b+""+c);
    
  }
}