#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;
while(i<=size){
    int flag = i;
    int j = 1;
    while(j<=i){
        cout<<flag<<" ";
        j++;
        flag++;
    }
    cout<<endl;
    i++;
}

return 0;
}