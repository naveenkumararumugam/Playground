#include<stdio.h>
int main()
{
  //Type your code here
   char m[100],len=0;
  scanf("%[^\n]s",m);
  for(int i=0;m[i]!='\0';i++)
  {
    len++;
  }
    printf("%d",len);
  return 0;
}