class prog01 {
  public static void main(String[] args) {
    int p1=10000;
    int p2=25000;
    int p3=50000;
    int n=5;
    double r1=14.5;
    double r2=10.5;
    double r3=9.5;
    double i1,i2,i3;
    i1=(p1*n*r1)/100;
    i2=(p2*n*r2)/100;
    i3=(p3*n*r3)/100;
    System.out.println("total simple interest "+(i1+p1)) ;
    System.out.println("total simple interest "+(i2+p2)) ;
    System.out.println("total simple interest "+(i3+p3)) ;
  }
}
