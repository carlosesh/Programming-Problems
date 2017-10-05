#include<iostream>

using namespace std;

int main ()
{
    long long n=0, a=0, d=0;
    cin>>n;
    char names[100000];

    for(int i=0; i<n; i++)
        cin>>names[i];

    for (int j=0; j<n; j++)
    {
        if (names[j]=='A')
            a++;
        else if (names[j]=='D')
            d++;
    }

    if (a>d)
        cout<<"Anton"<<endl;
    else if (a<d)
        cout<<"Danik"<<endl;
    else
        cout<<"Friendship"<<endl;
}