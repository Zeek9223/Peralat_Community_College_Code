#include <iostream>

using namespace std;

#include "minFunc.h"

const int *min(const int arr[], int arrSize) {
    
    if (arr == NULL || arrSize == 0)
        
        return NULL;
    
    if (arrSize == 1)
        
        return arr;
    
    const int *t = min(arr + 1, arrSize - 1);
    
    return *arr < *t ? arr : t;
    
}

int main() {
    
    int arrSize;
    
    cout<<"Enter Array Size: ";
    
    cin >> arrSize;
    
    int arr[arrSize];
    
    cout<<"Enter Array Elements: ";
    
    for (int i = 0; i < arrSize; ++i) {
        
        cin >> arr[i];
        
    }
    
    const int *minLoc = min(arr, arrSize);
    
    cout <<"Minimum is: " <<*minLoc << endl;
    
    return 0;
    
}
