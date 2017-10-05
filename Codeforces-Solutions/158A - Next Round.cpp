#include<iostream>

using namespace std;

int main ()
{
    int n=0, k=0, c=0, i=0, j=0, passed[100];
    cin>>n>>k;

    for (i=0; i<n; i++) cin>>passed[i];
    for (j=0; j<n; j++)
    {
        if(passed[j]>=passed[k-1] && passed[j]>0)
        {
            c++;
        }
    }

    cout<<c<<endl;
}