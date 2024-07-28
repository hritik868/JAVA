#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;
char ch = 'A';
while(i<=size){
    int j = 1;
    while(j<=size){
        cout<<ch<<" ";
        j++;
    }
    cout<<endl;
    ch++;
    i++;
}

return 0;
}
