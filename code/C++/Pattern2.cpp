#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the row size:";
cin>>size;
int i = 1;
int count =1;
while(i<=size){
    int j = 1;
    while(j<=size){
        cout<<count<<" ";
        j++;
        count++;
    }
    cout<<endl;
    i++;
}

return 0;
}
