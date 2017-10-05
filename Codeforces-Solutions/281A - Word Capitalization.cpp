#include <iostream>
#include <string.h>
#include <ctype.h>

using namespace std;

int main ()
{
    char str[1000];
    cin>>str;

    putchar (toupper(str[0]));
    for(int i=1; str[i]; i++)
    {
        cout<<str[i];
    }

}