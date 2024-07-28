#include<iostream>
using namespace std;


int main(){
int size;
cout<<"Enter the size:";
cin>>size;
int i = 1;
char ch = 'A';
while(i<=size){
    char ch1 = ch+size-i;
    int j = 1;
    while(j<=i){
        cout<<ch1<<" ";
        j++;
        ch1++;
    }
    cout<<endl;
    i++;
}

return 0;
}
