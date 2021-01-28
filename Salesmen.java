import java.util.*;
public class Salesmen{
  public static void main (String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the array limit");
    int x=kb.nextInt();
    double num[ ]=new double[x];
    for(int i=0;i<x;i++){
       System.out.println("enter a new num:");
       num[i]=kb.nextDouble();
    } 
    double total=num[0] ; 
    double max=num[0];
    int maxid=0;
    double min=num[0];
    int minid=0;
    for(int i=0;i<x;i++){
      total=total+num[i];
      if (num[i]>max){
        max=num[i];
        maxid=i+1;
      }
      if(num[i]<=min){
        min=num[i];
        minid=i+1;
      }
    }
    System.out.println("total amount of sale "+total);
    System.out.println("average "+total/x);
    System.out.println("the maximum sale:"+max);
    System.out.println("the id of employee made maximum sale:"+maxid);
    System.out.println("the minmum sale:"+min);
    System.out.println("the id of employee made minimum sale:"+minid);
    int wage=1000;
    for(int i=0;i<x;i++){
      if(num[i]<total/x)
        System.out.println("salary of salesman "+(i+1)+" is "+wage);
      else
        System.out.println("salary of salesman "+(i+1)+" is "+(wage+(wage/10)));
    }
  }
}

