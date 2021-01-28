#include <iostream>
#include <math.h>
using namespace std;
int bittodecimal() {
  int *arr=new int[8];
  int a,i,total;
  cout<<"enter a binary number"<<endl;
  for(i=0;i<8;i++){
    cin>>arr[i];
  }
  i=i-1;
  a=0;
  while(a<=7){
    total=total+(arr[i]*pow(2,a));
    a++;
    i--;
  }
  cout<<total;

}
