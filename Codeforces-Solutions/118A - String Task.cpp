#include <iostream>
#include <stdio.h>
#include <ctype.h>

using namespace std;

int main ()
{
    char str[1000];
    cin>>str;

    for(int j=0; str[j]!='\0'; j++)
    {
        if(str[j]== 'A' || str[j]== 'a' || str[j]== 'E' || str[j]== 'e' || str[j]== 'I' || str[j]== 'i' || str[j]== 'O' || str[j]== 'o' || str[j]== 'U' || str[j]== 'u' || str[j]== 'Y' || str[j]== 'y')
        {
            cout<<"";
        }
        else
        {
        cout<<".";
        putchar (tolower(str[j]));
        //cout<<"."<<str[j];
        }
    }

}