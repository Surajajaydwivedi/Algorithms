#include<iostream>
using namespace std;

void subsets(int arr[], int n){
    for(int i=0; i< (1<<n); i++){
        for(int j=0; j<n; j++){
            cout<<(i & (1<<j))<<" ";
            if(i & (1<<j)){
                cout<<arr[j]<<" ";
            }
        }
    }
}

int main(){
    int arr[4]= {1,2,3,4};
    subsets(arr,8);
    return 0;
}