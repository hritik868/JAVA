#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;
while(i<=size){
    int value = 1;
    int j = 1;
    while(j<=size-i){
        cout<<" ";
        j++;
    }
    while(j<=size){
        cout<<value;
        j++;
        value++;
    }
    
    int k = 1;
    int value2 = 1;
    while(k<=i-1){
        cout<<value2;
        k++;
        value2++;
    }
    
    cout<<endl;
    i++;
}

return 0;
}
