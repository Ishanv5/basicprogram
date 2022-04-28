#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int t1=0,t2=1,next,n;
    cout <<  "Enter the value of n : ";
    cin>>n;
    cout<<t1<<" "<<t2<<" ";  
      for(int i=3;i<=n;i++){
          next=t1+t2;
          cout<<next<<" ";
          t1=t2;
          t2=next;
      }

  return 0;
}