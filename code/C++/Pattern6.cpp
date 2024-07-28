#include<iostream>
using namespace std;

int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;
while(i<=size){
    int j=i;
    while(j>0){
        cout<<j<<" ";
        j--;
    }
    cout<<endl;
   i++;
}

return 0;
}