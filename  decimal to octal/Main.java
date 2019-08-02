#include<stdio.h>
int main()
{
  //type your code here
   int n,m[100],remcount=0,i;
  scanf("%d",&n);
  while(n!=0) 
  {
       m[remcount++] = n%8;
       n=n/8;
  }
  for(i=remcount-1;i>=0;i--)
  {

  printf("%d",m[i]);
  }
  return 0;
  return 0;
}