#include <iostream>
using namespace std;
int pascal1() {
  int x;
  cout << "Enter a number"<<endl;
  cin>>x;
  int *n1=new int[x];
  int *n2=new int[x];
  n1[0]=1;
  n1[1]=1;
  int n=1;
  while(n<=x){
    if(n==1)
      cout<<n1[0];
    if(n==2)
      cout<<n1[1];
    else{
      int i=1;
      n2[0]=n1[0];
      while(i<n){
        n2[i]=n1[i-1]+n1[i];
        i++;
      }
      n2[n-1]=1;
      cout<<endl;
      for(int a=0;a<n;a++){
        cout<<n2[a];
        n1[a]=n2[a];
      }
    } 
    n++;
  }
}
