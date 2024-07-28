#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = size;

while(i>=1){
    int j = size;
    while(j>=1){
        cout<<j<<" ";
        j--;
    }
    cout<<endl;
    i--;
}

return 0;
}
