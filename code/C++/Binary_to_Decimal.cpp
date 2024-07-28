#include <iostream>
#include<math.h>
using namespace std;
int n;
int main() {
    cout<<"Enter an number:";
    cin>>n;
    int m = n;
    int ans = 0;
    int i = 0;
    while(n!=0){
        int digit = n%10;
       if(digit == 1){
           ans = (digit * pow(2,i)) + ans;
       }
       i++;
       n = n/10;
    }
    cout<<"Decimal of "<<m<<" is: "<<ans;
    return 0;
}