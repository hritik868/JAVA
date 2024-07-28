#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;
int count = 1;
while(i<=size){
    int j = 1;
    while(j<=i){
        cout<<count<<" ";
        j++;
        count++;
    }
    cout<<endl;
    i++;
}

return 0;
}