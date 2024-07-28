#include<iostream>
using namespace std;

int main(){

// AND(&)
int a = 2; int b = 3;
int c = a&b;
cout<<"a&b = "<<c<<endl;

// OR(|)
c = a|b;
cout<<"a|b = "<<c<<endl;

// NOT(~)
c = ~a;
cout<<"~a = "<<c<<endl;

// XOR(^)
c = a^b;
cout<<"a^b = "<<c<<endl;

// Left shift(<<)
cout<<"5 << 1 = "<<(5<<1)<<endl;
cout<<"3 << 2 = "<<(3<<2)<<endl;

// Right shift(<<)
cout<<"5 >> 1 = "<<(5>>1)<<endl;
cout<<"3 >> 2 = "<<(3>>2)<<endl;
}