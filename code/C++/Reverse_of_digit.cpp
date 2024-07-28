#include <iostream>
using namespace std;
int n;
int main() {
    cout<<"Enter an number:";
    cin>>n;
    int m = n;
    int rev = 0;
    while(n!=0){
    int digit = n%10;
    rev = (rev * 10) + digit;
    n/=10;
    }
    cout<<"Reverse of "<<m<<" is: "<<rev;
    return 0;
}