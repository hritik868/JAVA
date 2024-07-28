#include <iostream>
using namespace std;

int fact(int n){
    int fact = 1;
    int i = 1;
    while(i<=n){
        fact = fact*i;
        i++;
    }
    return fact;
}

int main() {
    int n;
    cout<<"Enter the number to find its factotial: ";
    cin>>n;
    cout<<"Factorial of "<<n<<" is: "<<fact(n);
    return 0;
}