#include <bits/stdc++.h>
using namespace std;
stack<char> ch;
string ans;

char insert_at_bottom(char x)
{
    if (ch.empty())
    {
        ch.push(x);
    }
    else
    {
        char ele = ch.top();
        ch.pop();
        insert_at_bottom(x);
        ch.push(ele);
    }
}

char reverse()
{
    if (ch.size() > 0)
    {
        // here what we are doing is holding all the elements in function
        //call stack until we reach at the end;
        char x = ch.top();
        ch.pop();
        reverse();

        insert_at_bottom(x);
    }
}
int main()
{

    // push elements into
    // the stack
    ch.push('1');
    ch.push('2');
    ch.push('3');
    ch.push('4');

    cout << "Original Stack" << endl;

    // print the elements
    // of original stack
    cout << "1"
         << " "
         << "2"
         << " "
         << "3"
         << " "
         << "4"
         << endl;

    // function to reverse
    // the stack
    reverse();
    cout << "Reversed Stack"
         << endl;

    // storing values of reversed
    // stack into a string for display
    while (!ch.empty())
    {
        char p = ch.top();
        ch.pop();
        ans += p;
    }

    //display of reversed stack
    cout << ans[3] << " " << ans[2] << " "
         << ans[1] << " " << ans[0] << endl;
    return 0;
}