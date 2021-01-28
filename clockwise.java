import java.util.*;
class Main {
  public static void main(String[] args) {
    int a ;
    Scanner kbd = new Scanner(System.in);
    System.out.print("ENTER THE NUMBER :") ;
    int clockwise ;
    a =  kbd.nextInt();
   int num = a ;
   int count = 1 ;
    while(num > 1){
      num /= 10 ;
      count *= 10 ;
    }
    clockwise =  a%10 ;
    clockwise = clockwise * count  + a/10 ;
    System.out.println(clockwise);

  }
}
