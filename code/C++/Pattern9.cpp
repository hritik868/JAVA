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
    while(j<=i){
        cout<<ch<<" ";
        j++;
        ch++;
    }
    cout<<endl;
    
    i++;
}

return 0;
}
