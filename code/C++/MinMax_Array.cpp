#include <iostream>
using namespace std;

int minmax(int arr[], int size){
    int min = arr[0];
    int max = arr[0];
    
    for(int i = 1; i<size; i++){
        if(arr[i]<min){
            min = arr[i];
        }
    }
    for(int i = 1; i<size; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        
}
    cout<<"Min = "<<min<<endl;
    cout<<"Max = "<<max;
    return 0;
}

int main() {
    int n;
    cout<<"Enter the size of Array: ";
    cin>>n;
    int arr[n];
    cout<<"Enter values to the array: "<<endl;
    for(int i = 0; i<n; i++){
        cin>>arr[i];
    }
    
    minmax(arr,n);
    
    

    return 0;
}