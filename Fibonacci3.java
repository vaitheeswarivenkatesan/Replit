import java.util.*;
public class Fibonacci3{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    System.out.println("ENter a num:");
    int n=kb.nextInt();
    int a=0,b=1;
    while(b<n){
      b=a+b;  
      a=b-a;
    }
    if(n==b){
        System.out.println("THE GIVEN NUMBER IS FIBONACCI NUMBER");
      }
      else{
        System.out.println("THE GIVEN NUMBER IS NOT A FIBONACCI NUMBER");
      }
  }
}