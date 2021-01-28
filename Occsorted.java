import java.util.*;
public class Occsorted{
  public static void main (String[] args){
    int[] num={1,2,3,3,4,5};
    for(int i=0;i<num.length;i++){
      int count=0;
      for(int j=0;j<num.length;j++){
        if(num[i]==num[j]){
          count++;
        }
      }
      if(i==0)
        System.out.println(num[i]+" occured "+count+" times");
      else
      {
        if(num[i]>num[i-1])
          System.out.println(num[i]+" occured "+count+" times");
      }
    }
  }
}

