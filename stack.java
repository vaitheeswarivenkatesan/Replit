import java.util.*;
class Main {
  static int top=-1;
  public static void push(int[] arr,int x){
    Scanner kb=new Scanner(System.in);
    if(top==-1){
      for(int i=0;i<x;i++){
        System.out.println("enter the value for "+i+"place: ");
        int v=kb.nextInt();
        arr[i]=v;
        top=top+1;
      }
    }
  }

  public static void pop(int[]arr){
    if(top>=0){
      System.out.println(arr[top]);
      top=top-1;
    }
    else{
      System.out.println("no stack is available");
    }
  }
  public static void display(int[] arr){
      for(int i=top;i>=0;i--){
        System.out.println(arr[i]);
      }
  }
  public static void peak(int[]arr,int v){
    if(v<=top){
      for(int i=top;i>=0;i--){
        if(i==v){
          System.out.println(arr[i]);
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    int x=kb.nextInt();
    int arr[]= new int[x];
    push(arr,x);
    System.out.println();
    display(arr);
    System.out.println();
    peak(arr,0);
    System.out.println();
    pop(arr);
    System.out.println();
    display(arr);
    System.out.println();
    pop(arr);
    System.out.println();
    display(arr);

  }
}
