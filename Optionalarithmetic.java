import java.util.*;
public class Optionalarithmetic{
  public static void main (String[] args){
    char  ch;
    Scanner kb = new Scanner (System.in);
    System.out.println("Enter two number ");
    int a=kb.nextInt();
    int b=kb.nextInt();
    System.out.println("enter a character:");
    ch=kb.next().charAt(0);
    int n;
    while(ch!='X'){
    switch(ch){
      case '+':
          n=a+b;
          System.out.println(n);
          break;
      case '-':
          n=a-b;
          System.out.println(n);
          break;
      case '*':
          n=a*b;
          System.out.println(n);
          break;
      case '/':
          n=a/b;
          System.out.println(n);
          break;
     }
    System.out.println("Enter two number ");
    a=kb.nextInt();
    b=kb.nextInt();
    System.out.println("enter a character:");
    ch=kb.next().charAt(0);
    }
        
   }  
 }