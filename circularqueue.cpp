#include <bits/stdc++.h>
using namespace std;
#define n 30

class MyQueue
{
    int rear, front;
    int *arr;

    MyQueue()
    {
        rear = front = -1;
        arr = new int[n];
    }

    void enqueue(int x)
    {
        if ((front == 0 and rear == n - 1) or (rear == front - 1))
        {
            cout << "Queue is full" << endl;
        }

        // first element
        else if (front == -1)
        {
            front = 0;
            rear = 0;
            arr[rear] = x;
        }
        //last element
        else if (rear == n - 1 && front != 0)
        {
            rear = 0;
            arr[rear] = x;
        }
        else
        {
            rear++;
            arr[rear] = x;
        }
    }
    void display()
    {
        if (front == -1)
        {
            cout << "\nQueue is Empty";
            return;
        }
        printf("\nElements in Circular Queue are: ");
        if (rear >= front)
        {
            for (int i = front; i <= rear; i++)
                cout << "%d ", arr[i];
        }
        else
        {
            for (int i = front; i < n; i++)
                cout << "%d " << arr[i];

            for (int i = 0; i <= rear; i++)
                cout << "%d " << arr[i];
        }
    }
};
