import java.util.*;
public class Lengthconv{
  public static void main (String[] args){
    Scanner kb = new Scanner (System.in);
    System.out.println("enter a legnth:");
    int n=kb.nextInt();
    System.out.println("the given length in cm is"+n/10.0);
    System.out.println("the given length in m is"+n/1000.0);
  }
}