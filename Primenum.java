import java.util.*;

public class Primenum{
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter number:");
    int a=kb.nextInt();
    Boolean prime=true;
    int count=2;
    while (count<a){
      if(a%count==0)
        prime=false;
      count=count+1;
    }
    if (prime)
      System.out.println("Prime nUmber");
    else
      System.out.println("Not a Prime nUmber");
  }
}