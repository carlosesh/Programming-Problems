#include <iostream>
#include <string.h>

using namespace std;

int main ()
{
  char word[]={'h','e','l','l','o'}, input[1000];
  cin>>input;
  int length=strlen(input), x=0, y=0;
  for(int i=0; i<length; i++)
  {
    if(input[i]==word[x]) 
    {
      x++; 
      y++;
    }      
  }
  if(y==5)
    cout<<"YES"<<endl;
  else
    cout<<"NO"<<endl;
}