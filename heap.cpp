#include <iostream>
using namespace std;

void heapify(int arr[], int n, int i)
{
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (left < n && arr[left] > arr[largest])
    {
        largest = left;
    }
    if (right < n && arr[right] > arr[largest])
    {
        largest = right;
    }

    if (largest != i)
    {
        swap(arr[i], arr[largest]);
        heapify(arr, n, largest);
    }
}

void buildHeap(int arr[], int n)
{
    int si = (n / 2) - 1;
    for (int i = si; i >= 0; i--)

    {
        heapify(arr, n, i);
    }
}

void printHeap(int arr[], int n)
{
    cout << "Array representation of heap"
         << "\n";
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << "\n";
}
int main()
{
    // Binary Tree Representation
    // of input array
    // 1
    //           /     \
    // 3         5
    //      /    \     /  \
    // 4      6   13  10
    //    / \    / \
    // 9   8  15 17
    int arr[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};

    int n = sizeof(arr) / sizeof(arr[0]);

    buildHeap(arr, n);

    printHeap(arr, n);
    // Final Heap:
    // 17
    //           /      \
    // 15         13
    //       /    \      /  \
    // 9      6    5   10
    //     / \    /  \
    // 4   8  3    1

    return 0;
}
