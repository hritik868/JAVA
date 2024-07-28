#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;

while(i<=size){
    int j = 1;
    while(j<=size){
        cout<<j<<" ";
        j++;
    }
    cout<<endl;
    i++;
}

return 0;
}
