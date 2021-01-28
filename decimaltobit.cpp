#include <iostream>
using namespace std;
int decimaltobit() {
  int *arr=new int[8];
  int a,b,i=0,m;
  cout<<"enter a decimal number"<<endl;
  cin>>a;
  while(a/2 && i<=8){
    b=a%2;
    a=a/2;
    arr[i]=b;
    i++;
  }
  arr[i]=a;
  for(i=0;i<4;i++){
    m=arr[i];
    arr[i]=arr[7-i];
    arr[7-i]=m;
  }
  for(i=0;i<8;i++){
    cout<<arr[i];
  }
  

}
