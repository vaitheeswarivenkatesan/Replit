import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter number:");
    int a=kb.nextInt();
    Boolean prime=false;
    int count=2;
    while(a%count!=0 && count>a){
      prime=true;
    }
    if (prime){
      System.out.println("Prime nUmber");
    }
    else{
      System.out.println("Not a Prime nUmber");
    }
    
  }
}
