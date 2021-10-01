#include <bits/stdc++.h>
using namespace std;

class node
{
public:
    int data;
    node *next;

    node(int val)
    {
        data = val;
        next = NULL;
    }
};

class tanu
{
public:
    node *front;
    node *back;

    tanu()
    {
        front = NULL;
        back = NULL;
    }

    void enqueue(int x)
    {
        node *n = new node(x);
        back->next = n; // yaha se back k next mein n add kia
        back = n;       // back++;

        if (front == NULL)
        {
            back = n;
            front = n;
        }
    }

    void dequeue()
    {
        if (front == NULL)
        {
            cout << "queue is empty" << endl;
            return;
        }
        node *todel = front;
        front = front->next;

        delete todel;
    }
    int peek()
    {
        if (front == NULL)
        {
            return -1;
        }
        return front->data;
    }

    bool empty()
    {
        if (front == NULL)
        {
            return true;
        }
        return false;
    }
};

int main()
{
    tanu q;
    cout << "HI";

    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.enqueue(60);
    cout << q.peek() << endl;
    q.dequeue();
    cout << q.peek() << endl;

    return 0;
}