#include <iostream>
#include <stdio.h>
#include <cmath>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    int count=0;
	    cin>>n;
	    for(int i=0; i<=pow(2,n)-1; i++){
	        if( (i^(i+1))== ((i+2)^(i+3))){
	            count++;
	        }
	    }
	    cout<<count<<endl;
	}
	return 0;
}
