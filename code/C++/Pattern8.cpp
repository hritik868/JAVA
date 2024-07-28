#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;

while(i<=size){
    char ch = 'A';
    ch = ch+i-1;
    int j = 1;
    while(j<=size){
        cout<<ch<<" ";
        j++;
        ch++;
    }
    cout<<endl;
    i++;
}
return 0;
}
