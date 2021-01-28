import java.util.*;
public class Main{
  public static void main (String[] args){
    boolean triplet=false;
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the array limit");
    int x=kb.nextInt();
    int []num=new int[x];
    int i,j,z;
    for(i=0;i<x;i++){
      System.out.println("enter the "+(i+1)+" element of array: ");
      num[i]=kb.nextInt();
    }
    int m,n,p;
    int count=0;
    for(i=0;i<x;i++){
      for(j=i+1;j<x;j++){
          for(z=0;z<x;z++){
            if(z!=i && z!=j){
              m=num[i];
              n=num[j];
              p=num[z];
              if((m*m)+(n*n)==(p*p))  {
                triplet=true;
                count=count+1;
                System.out.println("("+m+"*"+m+"+"+n+"*"+n+"="+p+"*"+p+")");
               }
            }
          }
      }
    }
    if(triplet){
      System.out.println("yes the given array is a pythogorean triplet and it has "+count+" triplets");
    }
    else
       System.out.println("it is not a triplet array");
  }
}
