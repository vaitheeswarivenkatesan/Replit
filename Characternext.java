import java.util.*;
public class Characternext{
  public static void main (String[] args){
    char  ch;
    Scanner kb = new Scanner (System.in);
    System.out.println("enter a new character:");
    ch=kb.next().charAt(0);
    if((ch>='A'&& ch<='Y')||(ch>='a' && ch<='y')||(ch>='0' && ch<='8')){
         int n=ch+1;
         char a=(char) n;
         System.out.println(a);

      }
      else{
        System.out.println("Give a input which is in given range");
      }
   }  
 }