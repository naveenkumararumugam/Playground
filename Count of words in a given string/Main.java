#include<stdio.h>

int main()
{
  //Type your code here
  char m[100],i,word=1;
  scanf("%[^\n]s",m);
  for(i=0;m[i]!='\0';i++)
    if(m[i]==' ')
      word++;
//word++;
printf("%d",word);
return 0;  
}