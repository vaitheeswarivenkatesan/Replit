import java.util.*;
public class Occ2{
  public static void main (String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the array limit");
    int x=kb.nextInt();
    int [] num=new int[x];
    int [] count=new int[x];
    int temp=0;
    for(int i=0;i<num.length;i++){
       System.out.println("enter a new num:");
       num[i]=kb.nextInt();
    }   
    for(int i=0;i<num.length;i++){
          temp=num[i];
          count[temp]++;
    }
    for(int i=0;i<count.length;i++){
      if(count[i]!=0)
        System.out.println(i+" occured "+count[i]+" times");
    }
  }
}

